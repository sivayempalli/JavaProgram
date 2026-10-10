package Lec23_BackTracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        int queenK = 2;
        permutation(board,queenK,"",0);
    }

    public static void permutation(boolean[] boards, int queenk , String output ,int qlsf){

        if(qlsf == queenk){
            System.out.println(output);
            return;
        }


        for(int i=0; i<boards.length; i++){
            if(boards[i] == false){
                boards[i] = true;
                permutation(boards,queenk,output+"b"+i+"q"+qlsf,qlsf+1);
                boards[i] = false; //UNDO
            }
        }

    }
}

