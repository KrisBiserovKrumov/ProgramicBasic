package ObjectsАndClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class rollDice {
    static class  Dice{
        int sides;

        public Dice(int sides) throws IllegalAccessException {
            if (sides <= 0 || sides % 2 == 1){
                throw new IllegalAccessException("The dice munt have at least two side and must be even!");
            }
            this.sides = sides;
        }
        int roll (){
            Random rnd = new Random();
            int randomNumber = rnd.nextInt(this.sides);
            int result = randomNumber + 1;
            return result;

        }
    }
    public static void main(String[] args) throws IllegalAccessException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int diceCount = Integer.parseInt(reader.readLine());
        int sideaPerDice = Integer.parseInt(reader.readLine());
        int winingSumMinimum = Integer.parseInt(reader.readLine());

        List<Dice> dices = new ArrayList<>();

        for (int i = 0; i < diceCount ; i++) {
            Dice dice = new Dice(sideaPerDice);
            dices.add(dice);
            
        }
        int sum = 0;
        for (Dice dice : dices) {
            dice.roll();
            sum += dice.roll();
        }
        System.out.println("your sum is:" + sum);
        if (sum >= winingSumMinimum){
            System.out.println("Congratulations!");
        }else {
            System.out.println("Sorry, you have lost!");
        }
    }
}
