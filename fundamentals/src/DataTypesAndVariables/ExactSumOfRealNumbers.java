package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        BigDecimal sum =  new BigDecimal (0);

        for (int i = 0; i < a; i++) {
            BigDecimal number = new BigDecimal(reader.readLine());
            sum = sum.add(number);


        }
        System.out.println(sum);
    }
}
