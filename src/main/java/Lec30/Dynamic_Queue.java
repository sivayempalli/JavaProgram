package Lec30;

import Lec28_Stacks.Queue_New;

public class Dynamic_Queue extends Queue_New {

    @Override
    public void Enqueue(int item) {

        if(isFull()){

            int[] new_arr = new int[2 * size()];

            for(int i=0; i<arr.length; i++){
                int indx = ( front + i ) % arr.length ;
                new_arr[i] = arr[indx];
            }

            arr = new_arr;
            front = 0;

        }

        super.Enqueue(item);
    }
}
