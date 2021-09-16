package ListArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = reader.readLine().split(" ");
        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(bomb)){
            int index = numbers.indexOf(bomb);

            int begin = index - power;
            begin = Math.max(0,begin);

            for (int i = begin; i < index; i++) {
                numbers.remove(begin);

            }
            index = numbers.indexOf(bomb);
            int end = Math.min(index + power,numbers.size() - 1);
            for (int i = index; i <= end; i++) {
                numbers.remove(index);

            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;


        }
        System.out.println(sum);
    }
}
