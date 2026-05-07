package Lec3;

public class Pattern13 {
    public static void main(String[] args) {

        /*

        *
        * *
        * * *
        * * * *
        * * * * *  part 1
        * * * *
        * * *
        * *
        *           part 2

        increment star
        decrement star

        mirror pattern

         */

        int n = 5;
        int total = 2*n-1;
        int row = 1;
        int star = 1;

        while(row <= total){

            //print star
            int i = 1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            //mirror
            if(row < n){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
            row++;
        }



    }
}
