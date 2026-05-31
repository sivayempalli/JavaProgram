package Assignment3;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] testCases = new long[t];
        int index = 0;
        while(t-- > 0) {
            long binaryNumber = sc.nextLong();
            long decimalConverter = 1;
            long decimalNumber = 0;
            while (binaryNumber > 0) {
                decimalNumber = decimalNumber + decimalConverter * (binaryNumber % 10);
                binaryNumber = binaryNumber / 10;
                decimalConverter *= 2;
            }
            //System.out.println(decimalNumber);
            testCases[index] = decimalNumber;
            index++;
        }

        for(long testCase : testCases){
            System.out.println(testCase);
        }
    }
}
