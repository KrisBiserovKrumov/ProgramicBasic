package examMid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exersiceSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] command = line.split("\\|");
        int healt = 100;
        int coins = 0;
        int besroom = 1;

        for (String com : command) {
            String[] token = com.split(" ");
            String comand2 = token[0];
            int number = Integer.parseInt(token[1]);

            if (comand2.equals("potion")){
                besroom++;
                healt += number;
                if (healt > 100){
                    int diff = number - (healt - 100);
                    healt = 100;
                    System.out.printf("You healed for %d hp.%n",diff);
                }else {
                    System.out.printf("You healed for %d hp.%n", number);
                }
                System.out.printf("Current health: %d hp.%n", healt);
            }else if (comand2.equals("chest")){
                besroom++;
                coins += number;
                System.out.printf("You found %d coins.%n",number);
            }else{
                healt -= number;
                if (healt > 0){
                    besroom ++;
                    System.out.printf("You slayed %s.%n", comand2);
                }else {
                    System.out.printf("You died! Killed by %s.%n",comand2);
                    System.out.printf("Best room: %d%n",besroom);
                    break;
                }
            }
        }
        if (healt > 0 ){
            System.out.println("You've made it!");
            System.out.printf("Coins: %d%n",coins);
            System.out.printf("Health: %d%n",healt);
        }
    }
}
