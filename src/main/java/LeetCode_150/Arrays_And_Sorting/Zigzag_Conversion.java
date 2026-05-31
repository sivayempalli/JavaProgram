package LeetCode_150.Arrays_And_Sorting;

public class Zigzag_Conversion {
    public static void main(String[] args) {
        System.out.println(new Zigzag_Conversion_Solution().convert("PAYPALISHIRING",3));
        System.out.println(new Zigzag_Conversion_Solution().convert("PAYPALISHIRING",4));
        System.out.println(new Zigzag_Conversion_Solution().convert("C",2));
    }
}

class Zigzag_Conversion_Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length() == 1){
            return  s;
        }

        int len = 2*numRows-2;
        StringBuilder result = new StringBuilder();
        int row = 0;

        while(row <= numRows-1){
            int i = row;
            int prev = 0;
            while(i < s.length()){

                if(row != 0 && row != numRows-1){
                    if(prev-row >= 0 && prev-row < s.length()){
                        result.append(s.charAt(prev-row));
                    }
                }

                result.append(s.charAt(i));

                prev += len;
                i += len;
            }

            if(row != 0 && row != numRows-1){
                if(prev-row >= 0 && prev-row < s.length()){
                    result.append(s.charAt(prev-row));
                }
            }

            row++;
            //System.out.println(result);
        }

        return  result.toString();

    }
}
