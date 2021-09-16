package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> line = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt).sorted((num1,num2)-> num2.compareTo(num1)).collect(Collectors.toList());

        if (line.size() > 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(line.get(i) + " ");

            }
        }else {

            for (Integer integer : line) {
                System.out.print(integer + " ");

            }
        }


    }
}
