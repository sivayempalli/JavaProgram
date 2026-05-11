package Lec2;

public class Pattern6 {
    public static void main(String[] args) {
        /*
        * * * * *
            * * * *
                * * *
                     * *
                         *
         */
        int n = 5;
        int star = n;
        int row = n;
        int space = 0;

        while(row > 0){
            int print  = 0;
            int spacePrint = 0;
            while(spacePrint < space){
                System.out.print("  ");
                spacePrint = spacePrint + 1;
            }
            while(print < star){
                System.out.print("* ");
                print = print + 1;
            }

            System.out.println();
            star--;
            row--;
            space = space+2;
        }

    }
}
