package Lec30;

import Lec28_Stacks.Stack_New;

public class DynamicStack extends Stack_New {

    @Override
    public void push(int num) throws Exception {

        if(isFull()){
            int[] new_arr = new int[2 * size() ];
            for(int i=0; i<size(); i++){
                new_arr[i] = arr[i];
            }

            arr = new_arr;
        }

        super.push(num);
    }
}
