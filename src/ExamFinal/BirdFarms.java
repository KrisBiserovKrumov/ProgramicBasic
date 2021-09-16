package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirdFarms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceEgg = Double.parseDouble(reader.readLine()) / 100;
        double numb1 = Double.parseDouble(reader.readLine());
        double numb2 = Double.parseDouble(reader.readLine());
        double num3 = Double.parseDouble(reader.readLine());

        double firstMes = numb1 * 20;
        double numbSecondMes = numb2 + numb1;
        double secondMes = numbSecondMes * 20;
        double numbThereMes = numbSecondMes + num3;
        double thereMes = numbThereMes * 20;

        double total = firstMes + secondMes + thereMes;

        double rest = Math.floor(total * 0.96);

        double totalMoney = Math.floor(rest * priceEgg);
        System.out.printf("Profit: %.0f Lv." ,totalMoney);



    }
}
