package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int[] numbs = new int[numbers.length];


        for (int i = 0; i <numbers.length ; i++) {
            numbs[i] = Integer.parseInt(numbers[i]);
        }
        int maxlenght = 1;
        int counter = 1;
        int bestindex = 0;

        for (int i = 0; i < numbs.length - 1; i++) {
            if (numbs[i] == numbs [i+ 1]){
                counter++;

            }else {
                counter = 1;
            }
            if (counter > maxlenght) {
                maxlenght = counter;
                bestindex = i + 1;
            }

        }
        int begin = (bestindex - maxlenght) + 1;

        for (int i = begin; i < begin + maxlenght; i++) {
            System.out.print(numbs[i] + " ");

        }
        System.out.println();


    }
}
