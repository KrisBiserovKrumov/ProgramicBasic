package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class streemAPI {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] secondArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] thurstArr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int min = Arrays.stream(firstArr).min().getAsInt();
        int sum = Arrays.stream(secondArr).sum();
        double avg = Arrays.stream(thurstArr).average().getAsDouble();

        System.out.printf("%d,%d,%f",min,sum,avg);
    }
}
