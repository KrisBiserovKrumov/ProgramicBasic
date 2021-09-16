package exarcise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbs = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String numbers = "";

        for (int i = 0; i < numbs.length - 1 ; i++) {
            boolean top = true;
            for (int j = i + 1; j < numbs.length  ; j++) {
                if (numbs[i] <= numbs[j ]){
                    top = false;
                    break;
                }
            }
            if (top){
                numbers += numbs[i] + " ";
            }

        }
        numbers += numbs[numbs.length - 1] + " ";
        System.out.println(numbers);
    }
}
