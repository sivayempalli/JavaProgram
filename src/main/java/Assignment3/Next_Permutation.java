package Assignment3;

import java.util.LinkedList;
import java.util.Scanner;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i = size-1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(; i-1 >= 0 ; i--){
            if(arr[i-1] >= arr[i]){
                linkedList.add(arr[i]);
            }
            else{

                if(linkedList.size() == 0  || linkedList.getLast() <= arr[i-1]){
                    linkedList.add(arr[i-1]);
                }
                else if(linkedList.getFirst() > arr[i-1]){
                    linkedList.add(0, arr[i-1]);
                }
                else{
                    for(int j=0; j<linkedList.size(); j++){
                        if(linkedList.get(j) >= arr[i-1]){
                            linkedList.add(j, arr[i-1]);
                            break;
                        }
                    }
                }
                // linkedList.add(arr[i-1]);
                //arr[i-1] = arr[i];
                int ele  = arr[i-1];
                linkedList.add(arr[i]);
                //System.out.println(linkedList);
                for(Integer num : linkedList){
                    if(num > ele){
                        arr[i-1] = num;
                        linkedList.remove(num);
                        break;
                    }
                }

                break;
            }
        }

        // System.out.println(i);
        // System.out.println(linkedList);

        if(i == 0){
            linkedList.add(arr[0]);
        }



        for(Integer num : linkedList){
            arr[i] = num;
            i++;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
