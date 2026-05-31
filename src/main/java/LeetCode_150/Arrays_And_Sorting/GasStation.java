package LeetCode_150.Arrays_And_Sorting;

public class GasStation {
    public static void main(String[] args) {

        GasStation_Solution gasStationSolution = new GasStation_Solution();
        System.out.println(gasStationSolution.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[] {3,4,5,1,2}));
        System.out.println(gasStationSolution.canCompleteCircuit(new int[]{2,3,4}, new int[] {3,4,3}));

    }
}

class GasStation_Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        int gasLen = gas.length;

        for(int i=0; i<gasLen ;i++){
            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];
        }

        if(totalGas >= totalCost){
            int startIndex = 0;
            int currentCost = 0;
            for(int i=0 ; i<gasLen ; i++){
                currentCost = currentCost + gas[i]  - cost[i];
                if(currentCost < 0){
                    startIndex =  i+1;
                    currentCost = 0;
                }
            }

            return startIndex;
        }
        else{
            return  -1;
        }

//        int emptyGasStation = -1;
//        int maxCost = 0;
//        int len = gas.length;
//        int[] minimumGasNeeded = new int[len];
//
//        minimumGasNeeded[len-1] = gas[len-1] - cost[len-1];
//
//        for(int i=len-2 ; i>=0 ; i--){
//            minimumGasNeeded[i] = gas[i] - cost[i]  + minimumGasNeeded[i+1];
//        }
//
//        int prefixGasFilling = 0;
//
//        for(int i=0 ; i<len ;i++){
//
//            if( gas[i] > cost[i]){
//
//                if(i == 0){
//                    int totalCost = minimumGasNeeded[i]  + prefixGasFilling;
//                    if(maxCost < totalCost ){
//                        maxCost = totalCost;
//                        emptyGasStation = i;
//                    }
//
//                }
//                else {
//                    int totalCost = minimumGasNeeded[i]  + prefixGasFilling;
//                    if (maxCost < totalCost) {
//                        maxCost = totalCost;
//                        emptyGasStation = i;
//                    }
//
//                }
//            }
//
//            prefixGasFilling = prefixGasFilling + (gas[i] - cost[i]);
//        }
//        return emptyGasStation;
    }
}
