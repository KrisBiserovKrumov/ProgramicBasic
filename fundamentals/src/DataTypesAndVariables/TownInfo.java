package DataTypesAndVariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TownInfo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String town = reader.readLine();
        int people = Integer.parseInt(reader.readLine());
        int km = Integer.parseInt(reader.readLine());


        System.out.printf("Town %s has population of %d and area %d square km.", town,people,km);
    }
}
