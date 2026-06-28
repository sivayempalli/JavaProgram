package LeetCode_150.BinarySearch;

public class Median_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        System.out.println(new Median_Of_Two_Sorted_Arrays_Solution().findMedianSortedArrays(new int[]{1,3} , new int[]{2}));

    }
}

class Median_Of_Two_Sorted_Arrays_Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int mid = ( len1 + len2 ) / 2;

        int len = 0;
        int firstMid = Integer.MIN_VALUE;
        boolean firstFound = false;
        boolean secondFound = false;
        int secondMid = Integer.MIN_VALUE;
        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < len1 && secondIndex < len2){

            len++;

            if(nums1[firstIndex] < nums2[secondIndex]){


                if(mid == len){
                    firstMid = nums1[firstIndex];
                    firstFound = true;
                }

                if( mid+1 == len){
                    secondMid = nums1[firstIndex];
                    secondFound = true;
                }

                firstIndex++;

            }else{

                if(mid == len){
                    firstMid = nums2[secondIndex];
                    firstFound = true;
                }

                if( mid+1 == len){
                    secondMid = nums2[secondIndex];
                    secondFound = true;
                }

                secondIndex++;
            }

        }

        System.out.println(mid + " "+len + " " + firstMid + " "+firstIndex+" "+secondMid+" "+secondIndex );

        if(secondFound && (len1+len2)%2 != 0){
            return  secondMid;
        }

        if(firstIndex != len1){
            for(int i =firstIndex; i< len1; i++){
                len++;
                if(mid == len){
                    firstMid = nums1[i];
                    firstFound = true;
                }

                if( mid+1 == len){
                    secondMid = nums1[i];
                    secondFound = true;
                }
            }
        }

        System.out.println(mid + " "+len + " " + firstMid + " "+firstIndex+" "+secondMid+" "+secondIndex );

        if(secondIndex != len2){
            for(int i = secondIndex; i< len2; i++){
                len++;
                if(mid == len){
                    firstMid = nums2[i];
                    firstFound = true;
                }

                if( mid+1 == len){
                    secondMid = nums2[i];
                    secondFound = true;
                }
            }
        }
        System.out.println(mid + " "+len + " " + firstMid + " "+firstIndex+" "+secondMid+" "+secondIndex );

        if( (len1+len2)%2 != 0){
            return  secondMid;
        }

        return  (firstMid+secondMid)/2.0;
    }
}
