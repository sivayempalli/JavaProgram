package Lec3.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pascalPrev = new ArrayList<>();
        pascalPrev.add(0);
        pascalPrev.add(1);

        int row = 1;
        while(row <= n ){
            int i = 1;
            List<Integer> pascalNext = new ArrayList<>();
            pascalNext.add(0);

            while(i <= row){
                if(i == 1 || i == row){
                    System.out.print(1+"\t");
                    pascalNext.add(1);
                }else {
                    int sum = pascalPrev.get(i) + pascalPrev.get(i - 1);
                    pascalNext.add(sum);
                    System.out.print(sum+"\t");
                }
                i++;
            }
            System.out.println();
            row++;
            pascalPrev = pascalNext;
        }
    }
}
