package Lec41_Heap_PQ;

public class HeapClient {

    public static void main(String[] args) {

        MinHeap hp = new MinHeap();
        hp.add(5);
        hp.add(7);
        hp.add(9);
        hp.add(4);
        hp.add(2);
        hp.add(3);
        hp.add(1);
        hp.display();
    }
}
