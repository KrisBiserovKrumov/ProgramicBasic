package SimpleConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a > b ) {
            System.out.println("Greate a number:" + a);
        }else {
            System.out.println("Greate a number:" + b);
        }


    }
}
