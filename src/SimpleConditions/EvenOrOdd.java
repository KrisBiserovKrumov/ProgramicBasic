package SimpleConditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        boolean result = a % 2 == 0;

        if ( result){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
