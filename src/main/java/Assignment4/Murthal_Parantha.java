package Assignment4;

import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paranthas = sc.nextInt();
        int cooks = sc.nextInt();

        int[] stalls = new int[cooks];
        int maxRank = 0;
        for(int i=0; i<cooks; i++){
            stalls[i] = sc.nextInt();
            maxRank = Math.max(maxRank, stalls[i]);
        }

        int low = 1;
        int high = maxRank * paranthas * (paranthas + 1) / 2;

        int result = 1;

        while(low <= high){

            int mid = (low+high)/2;

            if(possibleParathas(stalls, mid,paranthas)){
                result = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            //System.out.println();
        }

        System.out.println(result);
    }

    private static boolean possibleParathas(int[] cooks, int minimumTime, int parathas){

        int noOfParathas = 0;
        for(int i=0; i< cooks.length; i++){
            int totalTime = cooks[i];
            int currentTime = cooks[i];
            while(totalTime <= minimumTime){

                noOfParathas = noOfParathas  + 1;

                currentTime = currentTime + cooks[i];
                totalTime = totalTime + currentTime;

            }
            //System.out.println(totalTime +" "+minimumTime+"  "+noOfParathas);
        }

        if(noOfParathas >= parathas){
            return  true;
        }

        return  false;
    }


}
