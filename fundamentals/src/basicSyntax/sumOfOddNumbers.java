package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumOfOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= a * 2 ; i+=2) {
            sum += i;
            System.out.println(i);

        }
        System.out.println("Sum: " + sum);
    }
}
