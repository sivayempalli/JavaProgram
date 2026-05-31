package Assignment3;

import java.util.*;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //int noOfTriplet = 0;

        if (size < 3){
            System.out.println("Not Possible");
        }

        Arrays.sort(arr);

        for(int i=0 ; i<size-3 ; i++){
            int first =arr[i];
            int secondNumberIndex = i+1;
            int thirdNumberIndex = size-1;

            while(secondNumberIndex < thirdNumberIndex){
                if(arr[secondNumberIndex] + arr[thirdNumberIndex] + first == target){
                    System.out.print(first +", "+ arr[secondNumberIndex]+" and "+arr[thirdNumberIndex]);
                    System.out.println();
                    secondNumberIndex++;
                    thirdNumberIndex--;
                }
                else if(arr[secondNumberIndex] + arr[thirdNumberIndex] + first > target){
                    thirdNumberIndex--;
                }
                else{
                    secondNumberIndex++;
                }
            }
        }


        //triplet sum
//        Map<Integer, List<List<Integer>>> map = new HashMap<>();
//        Arrays.sort(arr);
//
//        map.put(arr[0] + arr[1], new ArrayList<>(Arrays.asList( Arrays.asList(arr[0], arr[1]))));
//
//        for(int i=2; i<size ; i++){
//            int third = arr[i];
//            List<List<Integer>> list = (map.getOrDefault(target-third,new ArrayList<>()));
//            //noOfTriplet +=
//            for(int k=0; k<list.size() ; k++){
//                System.out.print(list.get(k).get(0) +", "+ list.get(k).get(1)+" and "+third);
//                System.out.println();
//            }
//
//            for(int j=0; j<i; j++){
//                map.putIfAbsent(third + arr[j], new ArrayList<>());
//                map.get(third + arr[j]).add(Arrays.asList(arr[j], third));
//            }
//        }

        //System.out.println(noOfTriplet);

    }
}
