package Lec32;

public class LinkedList {

    private class Node {

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

    }

    Node head;
    Node tail;
    int size;

    public void addFirst(int val){
        Node curr = new Node(val);

        if(head == null){
            head = curr;
            tail = curr;
            size++;
        }else{
            curr.next = head;
            head = curr;
            size++;
        }
    }

    public void addLast(int val){
        Node curr = new Node(val);

        if(tail == null){
            head = curr;
            tail = curr;
            size++;
        }
        else{
            tail.next = curr;
            tail = curr;
            size++;
        }
    }

    private Node getNode(int k){
        Node temp = head;
        for(int i=0; i<=k; i++){
            temp = temp.next;
        }
        return  temp;
    }

    public void addIthPos(int  pos , int val){
        if(pos == 0){
            addFirst(val);
        }else if(pos == size){
            addLast(val);
        }
        else{
            Node curr = new Node(val);
            Node prev  = getNode(pos - 1);
            curr.next = prev.next;
            prev.next = curr;
        }
    }

    public int getFistRow(){
        return head.val;
    }

    public int getLastRow(){
        return tail.val;
    }

    public  int getIthNode(int pos){
        return  getNode(pos).val;
    }

    public int removeHeadNode(){
        Node curr = null;
        if(size == 0){
            return -1;
        }

        curr = head;
        head = head.next;
        curr.next = null;
        return curr.val;
    }

    public int removeLastNode(){
        Node curr = null;
        if(size == 0){
            return -1;
        }

        Node last = getNode(size-2);
        last.next = null;
        tail = last;

        return  last.val;
    }

    public  int removeIthNode(int k){

        if(size == 0){
            return removeHeadNode();
        }
        else if(k == size){
            return  removeLastNode();
        }
        else{

            Node prev = getNode(k-1);
            Node curr = prev.next;

            prev.next = curr.next;
            curr.next = null;
            return  curr.val;

        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print(".");
        System.out.println();
    }

}
