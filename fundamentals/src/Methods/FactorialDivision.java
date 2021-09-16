package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double first = Double.parseDouble(reader.readLine());
        double second = Double.parseDouble(reader.readLine());

        double divisionREsult = fact(first) / fact(second);
        System.out.println(String.format("%.2f",divisionREsult));
    }
    public static double fact (double num){
        double factorial = 1;

        for (int i = 2; i <= num ; i++) {
            factorial *= i;

        }
        return factorial;
    }
}
