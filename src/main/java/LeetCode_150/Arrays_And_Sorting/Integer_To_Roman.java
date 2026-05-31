package LeetCode_150.Arrays_And_Sorting;

public class Integer_To_Roman {
    public static void main(String[] args) {
        System.out.println(new Integer_To_Roman_Solution().intToRoman(543));
        System.out.println(new Integer_To_Roman_Solution().intToRoman(3749));
        System.out.println(new Integer_To_Roman_Solution().intToRoman(58));
        System.out.println(new Integer_To_Roman_Solution().intToRoman(1994));

    }
}

class Integer_To_Roman_Solution {
    public String intToRoman(int num) {

        /*
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; ++i) {
            if (num == 0)
                break;
            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }

        return sb.toString();
         */

        String romanString = "";

        //1st Digit
        if(num > 0){
            int rem = num%10;

            if(rem <= 3){
                while(rem > 0){
                    romanString = "I"+romanString;
                    rem--;
                }
            }
            else if(rem == 4){
                romanString = "IV"+romanString;
            }
            else if(rem == 5){
                romanString = "V"+romanString;
            }
            else if(rem <= 8){
                romanString = "V"+romanString;
                while(rem > 5){
                    romanString = romanString+"I";
                    rem--;
                }
            }
            else{
                romanString = "IX"+romanString;
            }

            num = num/10;
        }

        //2nd Digit
        if(num > 0){
            int rem = num%10;

            if(rem <= 3){
                while(rem > 0){
                    romanString = "X"+romanString;
                    rem--;
                }
            }
            else if(rem == 4){
                romanString = "XL"+romanString;
            }
            else if(rem == 5){
                romanString = "L"+romanString;
            }
            else if(rem <= 8){
                String romanSubString = "L";
                while(rem > 5){
                    romanSubString = romanSubString+"X";
                    rem--;
                }
                romanString = romanSubString+romanString;
            }
            else{
                romanString = "XC"+romanString;
            }

            num = num/10;
        }

        //3rd Digit
        if(num > 0){
            int rem = num%10;

            if(rem <= 3){
                while(rem > 0){
                    romanString = "C"+romanString;
                    rem--;
                }
            }
            else if(rem == 4){
                romanString = "CD"+romanString;
            }
            else if(rem == 5){
                romanString = "D"+romanString;
            }
            else if(rem <= 8){
                String romanSubString = "D";
                while(rem > 5){

                    romanSubString = romanSubString+"C";
                    rem--;
                }
                romanString = romanSubString+romanString;
            }
            else{
                romanString = "CM"+romanString;
            }

            num = num/10;
        }

        // 4 digit
        if(num > 0){
            int rem = num%10;

            if(rem <= 3){
                while(rem > 0){
                    romanString = "M"+romanString;
                    rem--;
                }
            }
            num = num/10;
        }


        return  romanString;

    }
}