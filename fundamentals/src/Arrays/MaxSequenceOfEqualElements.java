package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumbers = reader.readLine().split(" ");

        int[] numbers = new int[strNumbers.length];


        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        int maxLenght = 1;
        int counter = 1;
        int bestIndex = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > maxLenght){
              maxLenght = counter;
              bestIndex = i + 1;
            }
        }
        int begin = (bestIndex - maxLenght) + 1;

        for (int i = begin; i <begin + maxLenght ; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

    }
}
