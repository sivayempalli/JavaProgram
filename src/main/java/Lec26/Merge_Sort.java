package Lec26;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {6,4,3,2,7,6,1,8,10,14};
        int[] sortArr = sortMerge(arr,0,arr.length-1);

        for(int res : sortArr){
            System.out.print(res+" ");
        }
        System.out.println();
    }

    public  static  int[] sortMerge(int[] arr, int si, int ei){

        //System.out.println(si +"     "+ei);
        if(si == ei){
            //System.out.println(arr[si]);
            return new int[]{arr[si]};
        }

        int mid = si +  ( (ei - si)/2 );

        int[] left = sortMerge(arr, si, mid);
        int[] right = sortMerge(arr,mid+1, ei);

        return mergeArr( left , right);
    }

    public  static int[] mergeArr( int[] left, int[] right){

        int len = left.length + right.length;
        int[] result = new int[len];

        int leftIndx = 0;
        int rightIndx = 0;
        int currentIndx = 0;

       // System.out.println(leftIndx+"     "+rightIndx +"    "+left.length+"    "+right.length);

        while(leftIndx < left.length && rightIndx < right.length){

            //System.out.println(currentIndx +"    "+leftIndx+"    "+left.length+"      "+rightIndx+"     "+ right.length);

            if(left[leftIndx] <= right[rightIndx]){
                result[currentIndx] = left[leftIndx];
                currentIndx++;
                leftIndx++;
            }
            else{
                result[currentIndx] = right[rightIndx];
                currentIndx++;
                rightIndx++;
            }
        }

        while(leftIndx < left.length){
            result[currentIndx] = left[leftIndx];
            currentIndx++;
            leftIndx++;
        }

        while(rightIndx < right.length){
            result[currentIndx] = right[rightIndx];
            currentIndx++;
            rightIndx++;
        }

//        System.out.println("sort");
//        for(int res : result){
//            System.out.print(res+" ");
//        }
//        System.out.println();


        return  result;
    }
}
