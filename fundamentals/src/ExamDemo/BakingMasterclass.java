package ExamDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BakingMasterclass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double baget = Double.parseDouble(reader.readLine());
        int students = Integer.parseInt(reader.readLine());
        double priceBrashno = Double.parseDouble(reader.readLine());
        double priceEgg = Double.parseDouble(reader.readLine()) * 10;
        double priceprestilka = Double.parseDouble(reader.readLine());

        double studentforPrestilka = students + Math.ceil(students * 0.20);
        int priceBrashno2 = students/ 5;
        int student3 = students - priceBrashno2;




        double result = priceprestilka * studentforPrestilka + priceEgg * students + priceBrashno * student3;

        if (result <= baget){
            System.out.printf("Items purchased for %.2f$.", result);
        }else{
            double diference = Math.abs(result - baget);
            System.out.printf("%.2f$ more needed.",diference);

        }


    }
}
