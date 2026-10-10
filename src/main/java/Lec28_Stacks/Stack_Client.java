package Lec28_Stacks;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack_New stn = new Stack_New();
        stn.push(10);
        stn.push(20);
        stn.push(30);
        stn.push(40);
        stn.push(50);
        stn.push(60);
        stn.display();
    }
}
