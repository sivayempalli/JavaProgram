package Lec3.Assignment;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        /*

                          5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4
                              3 2 1 0 1 2 3
                                2 1 0 1 2
                                  1 0 1
                                    0
                                  1 0 1
                                2 1 0 1 2
                              3 2 1 0 1 2 3
                            4 3 2 1 0 1 2 3 4
                          5 4 3 2 1 0 1 2 3 4 5

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2*n+1;
        int space = 0;
        int total = 2*n+1;
        int row = 1;
        int start = n;

        while(row <= total){
            int print = start;

            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            i =1;
            while(i<= star && print>= 0){
                System.out.print(print+" ");
                i++;
                print--;
            }

            print++;
            i--;

            int j = 1;
            while(i+j <= star){
                print++;
                System.out.print(print+" ");
                j++;
            }

            if(row < n+1){
                space+=1;
                star-=2;
                start = start-1;
            }
            else{
                space-=1;
                star+=2;
                start = start+1;
            }

            row++;
            System.out.println();
        }
    }
}
