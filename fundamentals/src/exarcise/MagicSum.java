package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int result = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numbers.length  ; i++) {

            for (int j = i + 1; j < numbers.length  ; j++) {
                if (numbers[i] + numbers[j] == result){
                    System.out.println(numbers[i] + " " + numbers[j]  );

                }else {
                    continue;
                }




            }


        }
    }
}
