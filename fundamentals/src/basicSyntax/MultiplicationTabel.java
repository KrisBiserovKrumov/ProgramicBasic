package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTabel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.printf("%d X %d = %d%n", a,i,result);

        }
    }
}
