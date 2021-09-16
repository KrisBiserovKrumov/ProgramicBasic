package objectAndClassExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dice {
    static class dicee {
        int size;


        public dicee(int size) {

            if (size <= 0 || size % 2 == 1){
             throw new IllegalArgumentException("The dice must have at least");
            }
            this.size = size;
        }
        int roll (){
            Random rnd =new Random();
            int randomNumber = rnd.nextInt(this.size);
            int result = randomNumber + 1;
            return result;

        }
    }
    public static void main(String[] args) throws IOException {
        //dicee dice = new dicee(3);
        //System.out.println("We are now rolling...");
        //System.out.println(dice.roll());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int diceCount = Integer.parseInt(reader.readLine());
        int sizePerDice = Integer.parseInt(reader.readLine());
        int winningSumMinim = Integer.parseInt(reader.readLine());
        List<dicee> dicees =new ArrayList<>();

        for (int i = 0; i <diceCount ; i++) {
            dicee dicee = new dicee(sizePerDice);
            dicees.add(dicee);
        }
        int sum = 0;

        System.out.printf("you sum is = %d%n",sum);

        for (dicee dicee : dicees) {
            sum += dicee.roll();
        }
        if (sum >= winningSumMinim){
            System.out.println("winner");
        }
        else{
            System.out.println("loser");
        }

    }
}
