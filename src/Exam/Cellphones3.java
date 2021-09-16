package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cellphones3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double bajet = Double.parseDouble(reader.readLine());
        double numMobile = Double.parseDouble(reader.readLine());
        String name = reader.readLine();
        double bonus = 0;
        double price = 0;


        switch (name){
            case "Gsm4e": {
                price = price + 20.50;
                bonus += 0.01;
                break;
            }case "Mobifon4e":{
                price = price + 50.75;
                bonus += 0.02;
                break;
            }case "Telefon4e":{
                price = price + 115;
                bonus += 0.03;
                break;
            }
        }if (numMobile > 10 && numMobile <= 20){
            bonus = bonus + 0.02;
        }else if (numMobile > 20 && numMobile <= 50){
            bonus = bonus + 0.05;
        }else if (numMobile > 50 ){
            bonus = bonus + 0.07;
        }else {
            bonus = bonus + 0 ;
        }
        double totalprice = price * numMobile - (price * numMobile) * bonus;
      if (bajet > totalprice){
          System.out.printf("The company bought all mobile phones. %.2f leva left.", bajet - totalprice);
      }else {
          System.out.printf("Not enough money for all mobiles. Company needs %.2f more leva.", totalprice - bajet);
      }

    }
}
