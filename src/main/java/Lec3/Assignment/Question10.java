package Lec3.Assignment;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int n = 7;
        int row = 1;
        int star = n;
        int space = -1;
        int mirror = n ;
        //System.out.println(mirror);

        while(row <= 2*n-1){

            int i =1;
            //star
            while(i <= star){
                System.out.print("*");
                i++;
            }
            //space
            i = 1;
            while(i <= space){
                System.out.print(" ");
                i++;
            }
            //star
            i = 1;
            if(row == 1 || row == 2*n-1){
                i = 2;
            }
            while(i <= star){
                System.out.print("*");
                i++;
            }

            //mirror
            if(row < mirror){
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
