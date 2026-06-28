package Assignment4;

import java.util.Scanner;

public class Painter_Partition_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfPainters = sc.nextInt();
        int noOfBoards = sc.nextInt();
        int[] boardLength = new int[noOfBoards];
        for(int i=0; i<noOfBoards; i++){
            boardLength[i] = sc.nextInt();
        }
        System.out.println(minimumTimeToCompletePainting(boardLength,noOfPainters,noOfBoards));

    }

    private static int minimumTimeToCompletePainting(int[] boardLength,int noOfPainters, int noOfBoards ){

        int low = 1;
        int high = 0;

        for(int i=0; i<noOfBoards; i++){
            high += boardLength[i];
        }

        int ans = 1;

        while(low <= high){

            int mid = low + ((high-low)/2);

            if(isMinimunTimetoPaint(boardLength, noOfPainters, noOfBoards, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return  ans;

    }

    private  static  boolean isMinimunTimetoPaint(int[] boardLength,int noOfPainters, int noOfBoards, int minimumTime) {

        int i = 0;

        while (noOfPainters > 0) {
            int paint = 0;
            while (i < noOfBoards && paint + boardLength[i] <= minimumTime) {
                paint += boardLength[i];
                i++;
            }

            if(i == noOfBoards){
                return  true;
            }

            noOfPainters--;

            //System.out.println(paint+"  "+i+" "+noOfPainters+" "+minimumTime);
        }

        if(i == noOfBoards){
            return  true;
        }
        return  false;
    }
}
