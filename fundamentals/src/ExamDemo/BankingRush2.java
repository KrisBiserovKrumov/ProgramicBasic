package ExamDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BankingRush2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] command = line.split("\\|");
        int energy = 100;
        int coins = 100;

        for (String com : command) {
            String[] token = com.split("-");
            String comand2 = token[0];
            int number = Integer.parseInt(token[1]);

            if (comand2.equals("rest")){
                energy += number;
                if (energy >= 100){
                    int diff = number - (energy - 100);
                    energy= 100;
                    System.out.printf("You gained %d energy.%n",diff);

                }else {
                    System.out.printf("You gained %d energy.%n",number);
                }
                System.out.printf("Current energy: %d.%n",energy);
            }

            else if (comand2.equals("order")){
                energy -= 30;
                if (energy > 0 ){
                    coins += number;
                    System.out.printf("You earned %d coins.%n",number);
                }else {
                    energy += 50;
                    System.out.println("You had to rest!");
                }
            }
            else {
                coins -= number;
                if (coins >= 0){
                    System.out.printf("You bought %s.%n",token[0]);
                }else {
                    System.out.printf("Closed! Cannot afford %s.%n",token[0]);
                    break;
                }
            }
        }
        if (coins > 0){
            System.out.println("Day completed!");
            System.out.printf("Coins: %d%n",coins);
            System.out.printf("Energy: %d",energy);
        }


    }
}