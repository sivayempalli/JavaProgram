package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] itemBuyForThatCost = new int[size];

        for(int i=0;i< size;i++){
            itemBuyForThatCost[i] = sc.nextInt();
        }
        int  t = sc.nextInt();
        String[] results = new String[t];
        int index = 0;

        while(t-- > 0){
            int cost = sc.nextInt();
            int items = sc.nextInt();
            results[index] = correctOrWrong(itemBuyForThatCost,cost,items);
            index++;
        }

        for(String result : results){
            System.out.println(result);
        }
    }

    private static  String correctOrWrong(int[] arr , int cost , int items){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(cost % arr[i]  == 0){
                count++;
            }
        }
        //System.out.println(cost+" "+items+" "+count);
        if(count >= items){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}


//Arrays.sort(itemBuyForThatCost);
//
////        for(int i=1; i< 10001 ;i++){
////            itemBuyForThatCost[i] += itemBuyForThatCost[i-1];
////        }
//
//
//
//        int t = sc.nextInt();
//        String[] results = new String[t];
//        int startIndex = 0;
//        while(startIndex < t) {
//
//            int costSheHas = sc.nextInt();
//            int itemShopperClaiming = sc.nextInt();
//            //System.out.println(itemBuyForThatCost[costSheHas]);
//            int totalCost = 0;
//            int totalItems = 0;
//            for(int i=0; i<itemBuyForThatCost.length; i++){
//                if(itemBuyForThatCost[i]  <= costSheHas){
//                    //totalCost += itemBuyForThatCost[i];
//                    totalItems++;
//                }
//            }
//
//            if(totalItems >= itemShopperClaiming){
//                results[startIndex] = "Yes";
//            }else{
//                results[startIndex] = "No";
//            }
//
//            startIndex++;
//        }