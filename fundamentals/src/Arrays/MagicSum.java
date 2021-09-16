package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strNumber = reader.readLine().split(" ");
        int numb = Integer.parseInt(reader.readLine());
        int[] number = new int[strNumber.length];

        for (int i = 0; i < strNumber.length; i++) {
            number[i] = Integer.parseInt(strNumber[i]);
        }

        int sum = 0;

        for (int i = 0; i < number.length   ; i++) {
            for (int j = i + 1 ; j < number.length ; j++) {
                sum = 0;
                sum += number[i] + number[j];
                if (sum == numb) {
                    System.out.println(number[i] + " " + number[j]);
                }else {
                    continue;
                }
            }
        }
    }
}
