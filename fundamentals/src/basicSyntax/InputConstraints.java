package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputConstraints {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double money = Double.parseDouble(reader.readLine());
        int students = Integer.parseInt(reader.readLine());
        double priceLightsabers = Double.parseDouble(reader.readLine());
        double priceRobes = Double.parseDouble(reader.readLine());
        double priceBelts = Double.parseDouble(reader.readLine());
        int belts = students / 6;

        double totalSabers = priceLightsabers * (students + Math.ceil(students * 0.10));
        double totalRobes = priceRobes * students;
        double totalBelts = priceBelts * (students - belts );

        double totalprice = totalBelts + totalRobes + totalSabers;

        if (money >= totalprice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalprice);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalprice - money);
        }

    }
}
