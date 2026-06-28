package Lec14_2D;

public class Question3_Spiral_Printing {
    public static void main(String[] args) {
        int[][] arr= {
                {1 ,2 ,3 ,4 ,5},
                {6 ,7 ,8 ,9 ,10},
                {11 ,12 ,13 ,14 ,15},
                {16 ,17 ,18 ,19 ,20},
                {21 ,22 ,23 ,24 ,25}
        };
        spiralPrinting(arr);

        System.out.println();

         int[][] nums= {
                {1 ,2 ,3 ,4 ,5},
                {6 ,7 ,8 ,9 ,10},
                {11 ,12 ,13 ,14 ,15},
                {16 ,17 ,18 ,19 ,20}
        };
        spiralPrinting(nums);

    }
    public static void spiralPrinting(int[][] arr){

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;
        int count = 0;
        int totalCount = arr.length*arr[0].length;

        while(count < totalCount) {
            for (int i = minCol; i <= maxCol && count < totalCount; i++) {
                System.out.print(arr[minRow][i] + " ");
                count++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow & count < totalCount; i++) {
                System.out.print(arr[i][maxCol] + " ");
                count++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol && count < totalCount; i--) {
                System.out.print(arr[maxRow][i] + " ");
                count++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow & count < totalCount; i--) {
                System.out.print(arr[i][minCol]+ " ");
                count++;
            }
            minCol++;

            //System.out.println(count +" "+totalCount);
        }

    }
}
