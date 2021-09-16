package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        int number = input;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            int factorial = 1;


            for (int i = 1; i <= digit; i++) {
                factorial *= i;

            }
            sum += factorial;
        }


        if (sum == input) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
