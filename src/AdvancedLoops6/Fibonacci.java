package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        int f0 = 1;
        int f1 = 1;

        for (int i = 0; i < a - 1; i++) {
            int F = f0 + f1;

            f0 = f1;
            f1 = F;
        }

        System.out.println(f1);
    }
}
