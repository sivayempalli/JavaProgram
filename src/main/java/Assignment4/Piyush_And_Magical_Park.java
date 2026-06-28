package Assignment4;

import java.util.Scanner;

public class Piyush_And_Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int k = sc.nextInt();
        int s= sc.nextInt();

        char[][] nums = new char[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                nums[i][j] = sc.next().charAt(0);
            }
        }

        boolean isFound = true;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(nums[i][j] == '#'){
                    break;
                }
                else if(nums[i][j] == '.'){
                    s = s - 2;
                    if(j != col-1){
                        s = s - 1;
                    }
                }
                else{
                    s = s + 5;
                    if(j !=  col-1){
                        s = s - 1;
                    }
                }
                //System.out.println(s);
            }
            if(s < k){
                isFound = false;
                break;
            }
        }

        if(isFound){
            System.out.println("Yes");
            System.out.println(s);
        }else{
            System.out.println("No");
        }
    }
}
