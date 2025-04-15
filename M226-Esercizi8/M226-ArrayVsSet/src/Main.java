import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<Integer>();
        Random rand = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            listNumbers.add(rand.nextInt());
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        HashSet<Integer> setNumbers = new HashSet<Integer>();
        Random rand2 = new Random();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            listNumbers.add(rand2.nextInt());
        }
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;

        System.out.println("Time ArrayList: " + elapsedTime);
        System.out.println("Time HashSet:   " + elapsedTime2);
    }
}