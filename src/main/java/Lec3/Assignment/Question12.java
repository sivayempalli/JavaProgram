package Lec3.Assignment;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        /*
                           1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int outerSpace = n-1;
        int innerSpace = -1;
        int start = 1;

        while(row <= n){
            int i = 1;
            int print = start;
            while(i <= outerSpace){
                System.out.print("  ");
                i++;
            }
            i=1;
            while(i <= star){
                System.out.print(print+" ");
                print--;
                i++;
            }
            i=1;
            while(i <= innerSpace){
                System.out.print("  ");
                i++;
            }
            i=1;
            if(row == 1 || row == n){
                i = 2;
            }
            while(i <= star){
                print++;
                System.out.print(print+" ");
                i++;
            }

            if(row < n/2+1) {
                innerSpace += 2;
                outerSpace -= 2;
                star += 1;
                start++;
            }else{
                innerSpace -= 2;
                outerSpace += 2;
                star -= 1;
                start--;
            }

            row++;
            System.out.println();
        }
    }
}
