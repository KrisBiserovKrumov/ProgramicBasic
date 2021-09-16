package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoundsToDollars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double pound = Double.parseDouble(reader.readLine());
        double dolar = pound * 1.31;


        System.out.printf("%.3f", dolar);
    }
}
