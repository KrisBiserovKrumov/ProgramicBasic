package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cinema {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double total = a * b * 12;
        double total1 = a * b * 7.5;
        double total2 = a * b * 5;

        if (type.equals("Premiere")){
            System.out.printf("%.2f leva " , total );
        }else  if (type.equals("Normal")) {
            System.out.printf("%.2f leva ", total1);
        }else
            System.out.printf("%.2f leva " , total2);

    }
}
