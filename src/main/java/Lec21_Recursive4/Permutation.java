package Lec21_Recursive4;

public class Permutation {
    public static void main(String[] args) {
        permutationGenerate(new int[] {1,2,3} , new boolean[3] , new StringBuilder());
    }

    public static  void permutationGenerate(int[] arr , boolean[] visited , StringBuilder result){

        int len = visited.length;

        if(len == result.length()){
            System.out.println(result);
            return;
        }

        for(int i=0; i<len; i++){

            if(!visited[i]){
                result.append(arr[i]);
                visited[i] = true;

                permutationGenerate(arr,visited,result);

                visited[i] = false;
                result.deleteCharAt(result.length() - 1);
            }
        }

    }
}
