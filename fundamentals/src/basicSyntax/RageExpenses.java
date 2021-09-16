package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RageExpenses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countLostGame = Integer.parseInt(reader.readLine());
        double headsetPrice  = Double.parseDouble(reader.readLine());
        double mousePrice  = Double.parseDouble(reader.readLine());
        double keyboardPrice  = Double.parseDouble(reader.readLine());
        double displayPrice  = Double.parseDouble(reader.readLine());

        double headset = (countLostGame / 2) * headsetPrice;
        double mouse = (countLostGame / 3) * mousePrice;
        double keyboard = (countLostGame / 6) * keyboardPrice;
        double display = (countLostGame / 12 ) * displayPrice;

        double totalprace = headset + mouse + keyboard + display;
        System.out.printf("Rage expenses: %.2f lv.",totalprace);



    }
}
