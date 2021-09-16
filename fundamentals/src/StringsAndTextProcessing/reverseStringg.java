package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseStringg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        while (!line.equals("end")){
            String revers = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                revers += line.charAt(i);

            }
            System.out.println(line + " = " + revers);

            line = reader.readLine();
        }


    }
}
