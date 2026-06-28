package Lec18_Recursive;

public class First_Occurance {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 5;
        System.out.println(find(arr,0,target));
    }

    public static int find(int[] arr , int index , int target){

        if(index < arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return find(arr,index+1, target);
    }

    public static boolean sorted(int[] arr , int index ){

        if(index == arr.length -1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }

        return sorted(arr,index+1);
    }

}
