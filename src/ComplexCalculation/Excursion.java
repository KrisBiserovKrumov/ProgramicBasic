package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double bajet = Double.parseDouble(reader.readLine());
        String season = reader.readLine();

        if (bajet <= 100){
            System.out.println("Somewhere in Bulgaria");
            if (season.equals("summer")){
                double price = 0.30 * bajet;
                System.out.printf("Camp - %.2f" , price);
                }else {
                double price2 = 0.70 * bajet;
                System.out.printf("Hotel - %.2f" , price2);

            }
        }else if (bajet <= 1000){
            System.out.println("Somewhere in Balkans");
            if (season.equals("summer")){
                double price = 0.40 * bajet;
                System.out.printf("Camp - %.2f" , price);
            }else {
                double price2 = 0.80 * bajet;
                System.out.printf("Hotel - %.2f" , price2);

            }
        }else {
            System.out.println("Somewhere in Europe");
            double price3 = 0.9 * bajet;
            System.out.printf("Hotel - %.2f" , price3);
        }
    }
}
