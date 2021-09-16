package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxSequencEqualElements {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int bestLenght = 0;
        int counter = 1;
        int lenght = 1;
        for (int i = 0; i < firstArr.length - 1 ; i++) {
            if (firstArr[i] == firstArr[i + 1]){
                counter++;

            }else {
                counter = 1;
            }
            if (counter > lenght){
                lenght = counter;
                bestLenght = i + 1;
            }

        }
        int begin = (bestLenght - lenght) + 1;
        for (int i = begin; i < begin + lenght ; i++) {
            System.out.print(firstArr[i] + " ");

        }
        System.out.println();

    }
}
