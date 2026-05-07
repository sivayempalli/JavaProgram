package Lec3;

public class Pattern17 {
    public static void main(String[] args) {
        /*

        * * *  * * *
        * *      * *
        *          *

        *          *
        * *      * *
        * * *  * * *


         */

        int n = 7;
        int row = 1;
        int star = n/2;
        int space = 1;
        int mirror = n/2 ;
        //System.out.println(mirror);

        while(row <= n){

            int i =1;
            //star
            while(i <= star){
                System.out.print("* ");
                i++;
            }
            //space
            i = 1;
            while(i <= space){
                System.out.print("  ");
                i++;
            }
            //star
            i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            //mirror
            if(row <= mirror){
                space += 2;
                star--;

            }
            else{
                space -= 2;
                star++;
            }
           // System.out.println(space +" "+ star+" "+row);

            System.out.println();
            row++;
        }



    }
}
