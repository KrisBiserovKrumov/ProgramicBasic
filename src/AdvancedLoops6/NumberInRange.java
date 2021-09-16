package AdvancedLoops6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberInRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        while (a < 1 || a > 100){
            System.out.println("Invalid number!");
            a = Integer.parseInt(reader.readLine());
        }
        System.out.println("The number is: " + a);
    }
}
