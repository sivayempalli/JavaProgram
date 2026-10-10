package Lec41_Heap_PQ;

import java.util.ArrayList;

public class MinHeap {

    ArrayList<Integer> ll = new ArrayList<>();

    public void add(int x){
        ll.add(x);
        upHeaify(ll.size() - 1);
    }

    public int remove(){
        swap(0, ll.size()-1);
        int x = ll.remove(ll.size()-1);
        downHeapify(0);
        return  x;
    }
    public void display(){
        System.out.println(ll);
    }

    private void downHeapify(int pIndex) {
        int lcIndex = 2 * pIndex + 1;
        int rcIndex = 2 * pIndex + 2;
        int minIndex = pIndex;

        if(lcIndex < ll.size() && ll.get(lcIndex) < ll.get(pIndex)){
            minIndex = lcIndex;
        }

        if(rcIndex < ll.size() && ll.get(rcIndex) < ll.get(pIndex)){
            minIndex = rcIndex;
        }

        if(pIndex != minIndex){
            swap(minIndex,pIndex);
            downHeapify(minIndex);
        }


    }

    private  void upHeaify(int cIndex){
        int pIndex = (cIndex-1)/2;
        if(ll.get(cIndex) > ll.get(pIndex)){
            swap(cIndex,pIndex);
            upHeaify(pIndex);
        }
    }

    private void swap(int cIndex, int pIndex){
        int cValue = ll.get(cIndex);
        int pValue = ll.get(pIndex);
        ll.set(cIndex,pValue);
        ll.set(pIndex,cValue);
    }
}
