package Lec26;

import java.util.Random;

public class RandomGeneration {
    public static void main(String[] args) {

        int startRange = 10;
        int endRange = 100;

        Random random = new Random();

        for(int i=0; i<10; i++){
            System.out.println(random.nextInt(endRange - startRange + 1) + startRange);
        }

    }
}
