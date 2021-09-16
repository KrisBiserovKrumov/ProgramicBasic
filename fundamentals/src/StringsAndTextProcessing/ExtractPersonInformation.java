package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        while (number-- > 0) {
            String text = reader.readLine();
            int begin = text.indexOf("@");
            int end = text.indexOf("|");
            String name = text.substring(begin + 1, end);

            int beginAge = text.indexOf("#");
            int endAge = text.indexOf("*");
            String age = text.substring(beginAge+1,endAge);
            System.out.println(String.format("%s is %s years old.",name,age));

        }

    }
}
