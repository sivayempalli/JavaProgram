package Lec5_DataTypeANDTypeCast;

public class NumberToBinary {
    public static void main(String[] args) {
        int decimal = 18;
        int binary = 0;
        int convert = 1 ; //(power(10,0));

        while(decimal > 0){
            binary = convert * ( decimal%2 ) + binary;
            decimal = decimal/2;
            convert = convert*10;
        }

        System.out.println("Binary Number : " +  binary);
    }
}
