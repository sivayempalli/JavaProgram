package Lec19_Recursive3;

public class Reach_Destination {
    public static void main(String[] args) {
        int h = 3;
        int v = 3;
        System.out.println(reachRecursive(0,0,h-1,v-1));
    }
    public static  int  reachRecursive(int currentH, int currentV, int horizontal , int vertical){
        if(currentH == horizontal && currentV == vertical){
            return  1;
        }

        if(currentH > horizontal || currentV > vertical){
            return  0;
        }

        int h = reachRecursive(currentH+1, currentV, horizontal, vertical);
        int v = reachRecursive(currentH, currentV+1,horizontal,vertical);
        return  h + v;
    }

}
