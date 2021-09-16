package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        while (a % 2 != 0){
            System.out.println("Please write an even number.");
            a = Integer.parseInt(reader.readLine());
        }
        System.out.printf("The number is: %d",Math.abs(a) );
    }
}
