package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionNumb {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1 = Double.parseDouble(reader.readLine());
        double num2 = Double.parseDouble(reader.readLine());
        String operator = reader.readLine();

        String evenOrOdd = "";

        if (num2 == 0 && (operator.equals("/") || operator.equals("%"))){
            System.out.printf("Cannot divide %.0f by zero", num1);
        } else {
            if (operator.equals("+")){
                double result = num1 + num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f + %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("-")){
                double result = num1 - num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f - %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("*")){
                double result = num1 * num2;
                evenOrOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%.0f * %.0f = %.0f - %s", num1,num2, result, evenOrOdd);
            } else if (operator.equals("/")){
                double result = num1 / num2;
                System.out.printf("%.0f / %.0f = %.2f", num1, num2 , result);
            } else if (operator.equals("%")){
                double result = num1 % num2;
                System.out.printf("%.0f %% %.0f = %.0f", num1, num2, result);
            }
        }
    }
}


