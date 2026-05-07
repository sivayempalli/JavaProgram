package Lec5_DataTypeANDTypeCast;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int decimal = 0;
        int binary = 10010;
        int convert = 1;

        while(binary > 0){
            decimal = convert * ( binary%10 ) + decimal;
            binary = binary/10;
            convert = convert*2;
        }

        System.out.println("Decimal Number : " +  decimal);
    }
}
