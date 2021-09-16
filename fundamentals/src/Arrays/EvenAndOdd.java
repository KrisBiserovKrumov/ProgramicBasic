package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        int[] numb = new int [numbers.length];
        int sum = 0;
        int sumEven = 0;

        for (int i = 0; i <numbers.length ; i++) {
            numb[i] = Integer.parseInt(numbers[i]);
            if (numb[i] % 2 == 0){
                sum += numb[i];
            }else {
                sumEven += numb[i];
            }
        }
        System.out.println(sum - sumEven);
    }
}
