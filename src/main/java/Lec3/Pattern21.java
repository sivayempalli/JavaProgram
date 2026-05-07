package Lec3;

public class Pattern21 {
    public static void main(String[] args) {


        int n = 5;
        int row = 1;
        int star = 1;
        int  space = 2*n - 3;

        while(row <= n){

            int i =1;
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            i = 1;
            while(i<= space){
                System.out.print("  ");
                i++;
            }

            i= 1;
            if(row == n){
                i=2;
            }
            while(i <= star){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            row++;
            star++;
            space-= 2;

        }

    }
}
