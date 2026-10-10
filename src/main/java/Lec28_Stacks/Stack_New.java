package Lec28_Stacks;

public class Stack_New {
    protected int[] arr;
    private int indx = -1;

    public Stack_New() {
        //arr = new int[5];
        this(5);
    }

    public Stack_New(int n) {
        arr = new int[n];
    }

    //O(1)
    public boolean isEmpty(){
        return indx == -1;
    }

    public void push(int num) throws Exception {

        if(isFull()){
            throw new Exception("Stack Full");
        }

        arr[++indx] = num;
    }

    public int size(){
        return  indx + 1;
    }

    public boolean isFull(){
        return size() == arr.length;
    }

    public int pop() throws  Exception{

        if(isEmpty()){
            throw new Exception("Stack Empty");
        }

        int item = arr[indx--];
        return  item;
    }

    public int peek() throws Exception{

        if(isEmpty()){
            throw new Exception("Stack Empty");
        }

        return arr[indx];
    }

    public void  display(){
        for(int i=0; i<= indx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }





}
