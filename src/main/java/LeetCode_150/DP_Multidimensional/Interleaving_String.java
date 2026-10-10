package LeetCode_150.DP_Multidimensional;

public class Interleaving_String {
    public static void main(String[] args) {

    }
}

class Interleaving_String_Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();
        if(len1+len2 != len3){
            return  false;
        }

        return  traverse(s1,s2,s3, 0 ,0 ,0, 0,0,null);
    }

    boolean traverse(String s1, String s2 , String s3, int s1Pos, int s2Pos, int s3Pos, int s1Cuts, int s2Cuts,Boolean prevCut){

        if(s3Pos == s3.length()){

            System.out.println(s1Pos +"  "+s2Pos+" "+s3Pos+"  "+s1Cuts+"  "+ s2Cuts);
            if(Math.abs(s1Cuts-s2Cuts) <= 1){
                return  true;
            }else{
                return  false;
            }
        }


        boolean found = false;

        if(s1Pos < s1.length()){

            if(s1.charAt(s1Pos) == s3.charAt(s3Pos)){
                if(prevCut == null || prevCut.equals(Boolean.TRUE)){
                    prevCut = Boolean.TRUE;
                }else{
                    s2Cuts++;
                    prevCut = Boolean.TRUE;
                }
                found = traverse(s1,s2,s3,s1Pos+1, s2Pos, s3Pos+1, s1Cuts, s2Cuts, prevCut);
            }

        }

        if(found){
            return  true;
        }

        if(s2Pos < s2.length()){
            if(s2.charAt(s2Pos) == s3.charAt(s3Pos)){

                if(prevCut == null || prevCut.equals(Boolean.FALSE)){
                    prevCut = Boolean.TRUE;
                }else{
                    s1Cuts++;
                    prevCut = Boolean.FALSE;
                }
                return traverse(s1,s2,s3,s1Pos, s2Pos+1, s3Pos+1, s1Cuts,s2Cuts,prevCut);
            }
        }

        return  false;

    }
}
