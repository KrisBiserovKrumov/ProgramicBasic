package basicSyntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        double grate = Double.parseDouble(reader.readLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f" , name,age,grate);

    }
}
