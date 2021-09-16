package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class doublee {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double [] firstArr = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        int[] firstArrr = Arrays.stream(reader.readLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        String[] first = reader.readLine().split(" ");



    }
}
