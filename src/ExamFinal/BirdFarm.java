package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BirdFarm {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double priceEgg = Double.parseDouble(reader.readLine());
        double numbFirst = Double.parseDouble(reader.readLine());
        double numbsecond = Double.parseDouble(reader.readLine());
        double numbTheree = Double.parseDouble(reader.readLine());


        double totalEggsFurst =  numbFirst * 20;
        double numbSegondTotal = numbsecond + numbFirst;
        double numbThereTotal = numbSegondTotal + numbTheree;
        double totalEggsSecond =  numbSegondTotal * 20;
        double totalEggsThere =  numbThereTotal * 20;

        double totalEggs = totalEggsFurst + totalEggsSecond + totalEggsThere;
        double rest = Math.floor(totalEggs - (totalEggs * 0.04)) ;
        double sum = rest * priceEgg / 100;

        System.out.printf("Profit: %.0f Lv.", sum);

    }
}
