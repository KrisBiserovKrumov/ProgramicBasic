package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BraceletStand {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double daysMoney = Double.parseDouble(reader.readLine());
        double moneyOfDay = Double.parseDouble(reader.readLine());
        double razhodi = Double.parseDouble(reader.readLine());
        double price = Double.parseDouble(reader.readLine());

        double totalDayMoney = 5 * daysMoney;
        double totalMoneyOfDay = 5 * moneyOfDay;
        double totalMoney = totalDayMoney + totalMoneyOfDay - razhodi;

        if (totalMoney >= price){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",totalMoney);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.", Math.abs(totalMoney - price));
        }
    }
}
