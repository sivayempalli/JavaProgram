package Lec3;

public class Pattern14 {
    public static void main(String[] args) {
        /*
                  *
                * *
              * * *
            * * * *
          * * * * *
            * * * *
              * * *
                * *
                  *

         */

        int n = 5;
        int total = 2*n-1;
        int row = 1;
        int star = 1;
        int space = n-star;

        while(row <= total){

            int i = 1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            i =1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            //mirror
            if(row < n ){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
            System.out.println();
            row++;

        }
    }
}
