package Lec28_Stacks;

public class Queue_New {
    //
    protected   int[] arr;
    protected int front;
    private int size ; //work like rear

    public Queue_New() {
        this(5);
    }

    public Queue_New(int n) {
        arr = new int[n];
    }

    //O(1)
    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return  size ;
    }

    public boolean isFull(){
        return size() == arr.length;
    }

    public void Enqueue(int item){
        arr[size++] = item;

    }

    public int Dequeue(){
        int item = arr[front];
        front++;
        size--;
        return  item;
    }





    public void  display(){
        for(int i=0; i<= size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
