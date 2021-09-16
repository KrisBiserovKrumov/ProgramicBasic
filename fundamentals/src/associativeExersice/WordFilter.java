package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = Arrays.stream(reader.readLine().split(" ")).filter(e -> e.length() % 2 == 0).toArray(String[]::new);

        for (int i = 0; i <line.length ; i++) {
            System.out.println(line[i] + " ");

        }



    }
}
