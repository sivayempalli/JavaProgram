package Assignment2;

import java.util.*;

public class Question14 {
    public static void main(String[] args) {
        int print = 0;
        Scanner sc = new Scanner(System.in);
        List<Integer> ll = new ArrayList<>();
        while (sc.hasNext()){
            ll.add(sc.nextInt());
        }
        for(int i=0;i<ll.size();i++){
            print += ll.get(i);
            if(print < 0){
                break;
            }
            System.out.println(ll.get(i));
        }
    }
}
