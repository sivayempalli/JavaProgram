package Assignment3;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] results = new int[t];
        int startIndex = 0;


        while(startIndex < t) {

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int rickshaws = sc.nextInt();;
            int cabs = sc.nextInt();

            int minRickshawsCost = 0;
            int minCabCost = 0;


            for(int i=0 ; i<rickshaws ; i++){
                int minForThatRicksaw = Math.min(sc.nextInt()*c1 ,c2);
                minRickshawsCost += minForThatRicksaw;
            }

            for(int i=0 ; i<cabs ; i++){
                int minForThatCab = Math.min(sc.nextInt()*c1 ,c2);
                minCabCost += minForThatCab;
            }

            //System.out.println(minRickshawsCost +"  "+ minCabCost);

            minRickshawsCost = Math.min(minRickshawsCost , c3);
            minCabCost = Math.min(minCabCost, c3);
            //System.out.println(minRickshawsCost +"  "+ minCabCost);

            results[startIndex] = Math.min(minRickshawsCost+minCabCost , c4);
            startIndex++;

        }

        for(int result : results){
            System.out.println(result);
        }
    }
}
