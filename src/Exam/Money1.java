package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Money1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double bitcoin = Double.parseDouble(reader.readLine())* 1168;
        double ioan = Double.parseDouble(reader.readLine()) * 0.15;
        double comision = Double.parseDouble(reader.readLine())/ 100;
        double leva = ioan * 1.76;
         double total = (leva + bitcoin) / 1.95;
          double totalComision = total * comision;
          double totaRest = total - totalComision;
        System.out.printf("%.2f", totaRest);


    }
}
