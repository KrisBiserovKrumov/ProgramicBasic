package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchoolRoom1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine()) * 100;
        double b = Double.parseDouble(reader.readLine()) * 100 ;


double bura = Math.floor((b - 100) / 70);
double table = Math.floor(a / 120);
double total = bura * table - 3;
        System.out.println(total);

    }
}
