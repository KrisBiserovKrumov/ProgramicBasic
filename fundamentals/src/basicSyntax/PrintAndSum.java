package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numb = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());

        int sum = 0;

        for (int i = numb; i <= numb2; i++) {
            sum += i;
            System.out.print(i + " ");

        }
        System.out.println("");

        System.out.println("Sum: " + sum);

    }
}
