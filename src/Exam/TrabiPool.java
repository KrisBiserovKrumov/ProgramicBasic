package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrabiPool {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double obemPool = Double.parseDouble(reader.readLine());
        double traba1 = Double.parseDouble(reader.readLine());
        double traba2 = Double.parseDouble(reader.readLine());
        double hours = Double.parseDouble(reader.readLine());


        double totalTraba1 = traba1 * hours;
        double totalTraba2 = traba2 * hours;
        double total = totalTraba1 + totalTraba2;
        if (total <= obemPool){
            double porcent =Math.floor(total / obemPool * 100) ;
            double porcentFirst =Math.floor(totalTraba1 / total * 100) ;
            double porcentSecond = Math.floor(totalTraba2 / total * 100);
            System.out.printf("The pool is %.2f%%  full. Pipe 1: %.2f%% . Pipe 2: %.2f%%" , porcent,porcentFirst,porcentSecond);

        }else {
            double diferent = total - obemPool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, diferent);
        }

    }
}