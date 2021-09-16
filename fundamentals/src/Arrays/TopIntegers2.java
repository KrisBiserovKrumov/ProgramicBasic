package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopIntegers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int[] numb = new int[numbers.length];



        for (int i = 0; i < numbers.length ; i++) {
            numb[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < numb.length - 1; i++) {
            if (numb[i ] > numb[i + 1]){
                System.out.print(numb[i] + " ");
            }
        }
        System.out.println(numb[numbers.length - 1]);





    }
}
