package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> firstPlayer = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayer.size() > 0 && secondPlayer.size() > 0 ){
            int firstCard = firstPlayer.get(0);
            int secondCard = secondPlayer.get(0);

            firstPlayer.remove(0);
            secondPlayer.remove(0);

            if (firstCard > secondCard){

                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }
            else if (firstCard < secondCard){
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);

            }
        }
        if (firstPlayer.size() > 0){
            int sum = 0;
            for (Integer integer : firstPlayer) {
                sum += integer;

            }
            System.out.printf("First player wins! Sum: %d",sum);

        }else if (secondPlayer.size() > 0){
            int sum = 0;
            for (Integer integer : secondPlayer) {
                sum += integer;


            }
            System.out.printf("Second player wins! Sum: %d", sum);

        }
    }
}
