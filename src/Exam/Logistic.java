package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logistic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double tovar = Double.parseDouble(reader.readLine());
        double sum = 0;
        double bus = 0;
        double camion = 0;
        double tren = 0;

        for (int i = 0; i < tovar; i++) {
            double toneladas = Double.parseDouble(reader.readLine());
            sum += toneladas;

            if (toneladas <= 3){
                bus += toneladas;
                }else if (toneladas > 3 && toneladas <= 11){
                camion += toneladas;
            }else{
                tren += toneladas;
            }
        }
        double midPrice = (bus * 200 + camion * 175 + tren * 120) / sum;
        System.out.printf("%.2f%n",midPrice);
        double porcentBus = bus / sum * 100;
        double porcentCamion = camion / sum * 100;
        double porcentTren = tren / sum * 100;
        System.out.printf("%.2f%%%n",porcentBus);
        System.out.printf("%.2f%%%n",porcentCamion);
        System.out.printf("%.2f%%%n",porcentTren);


    }
}
