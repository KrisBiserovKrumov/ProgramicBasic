package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Volleyball {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        double holiday = Double.parseDouble(reader.readLine());
        double weekend = Double.parseDouble(reader.readLine());

        double inSofia = 48 - weekend;
        double inSofiaWeekend = inSofia * 3 /4;
        double SofiaHoliday = holiday * 2 / 3 ;
        double total = inSofiaWeekend + weekend + SofiaHoliday;
        double Leap = (0.15 * total) + total;

        if (type.equals("leap")){
            System.out.println(Math.floor(Leap));
        }else{
            System.out.println(Math.floor(total));
        }

    }
}
