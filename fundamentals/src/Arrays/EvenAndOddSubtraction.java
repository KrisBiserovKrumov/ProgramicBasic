package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EvenAndOddSubtraction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)). toArray();
        int evensum = 0;
        int oddsum = 0;

        for (int number : numbers){
            if (number % 2 == 0){
                evensum += number;
            }else {
                oddsum += number;
            }
        }
        int diff = evensum - oddsum;
        System.out.println(diff);
    }
}
