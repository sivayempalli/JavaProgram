package Assignment4;

import java.util.Scanner;

public class Book_Allocation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] results= new int[t];
        int index = 0;

        while(t-- > 0){

            int noOfBooks = sc.nextInt();
            int noOfStudent = sc.nextInt();
            int[] eachPages = new int[noOfBooks];
            int high = 0;
            for(int i=0; i<noOfBooks; i++){
                eachPages[i] = sc.nextInt();
                high += eachPages[i];
            }

            int low = 1;
            int ans = 1;

            while (low <= high){
                int mid = (low+high)/2;

                if(isPossiblePagesAssign(eachPages , noOfStudent , mid)){
                    ans = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            results[index++]  = ans;

        }

        for(int result : results){
            System.out.println(result);
        }
    }

    private static boolean isPossiblePagesAssign(int[] eachPages, int noOfStudent,int min ){

        int currentBook = 0;

        while(noOfStudent > 0){

            int pageCount = 0;
            while(currentBook < eachPages.length && pageCount + eachPages[currentBook] <= min ){
                pageCount += eachPages[currentBook];
                currentBook++;
            }

            if(currentBook == eachPages.length){
                return  true;
            }

            noOfStudent--;
        }

        if(currentBook == eachPages.length){
            return  true;
        }
        return  false;
    }
}
