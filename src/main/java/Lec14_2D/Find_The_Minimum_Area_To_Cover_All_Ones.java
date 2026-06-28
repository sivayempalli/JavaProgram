package Lec14_2D;

public class Find_The_Minimum_Area_To_Cover_All_Ones  {
    public static void main(String[] args) {
        int[][] arr= {
                {1 ,0 ,0 ,0 ,0},
                {0 ,0 ,0 ,0 ,0},
                {0 ,0 ,0 ,0 ,0},
                {0 ,0 ,0 ,1 ,0},
                {0 ,0 ,0 ,1 ,0}
        };

        System.out.println(minimumArea(arr));
    }

    public static  int minimumArea(int[][] grid) {

        int minRow = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;

        int maxRow = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;


        for(int  i=0; i< grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);

                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        if(maxRow != Integer.MIN_VALUE){
             return  (maxRow - minRow + 1) * (maxCol - minCol + 1);
        }else{
            return  0;
        }
    }
}
