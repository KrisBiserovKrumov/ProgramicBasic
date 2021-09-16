package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        String regex = "%(?<name>[A-Z][a-z]+)%([^\\|$%.]*)<(?<product>\\w+)>([^\\|$%.]*)\\|(?<count>[0-9]+)\\|([^\\|$%.]*)(?<price>[1-9][0-9]?[0-9.]+)\\$";
        List<String> result = new ArrayList<>();
        double total = 0 ;



        while (!text.equals("end of shift")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {


                String name = matcher.group(1);
                String product = matcher.group(3);
                int quantity = Integer.parseInt(matcher.group(5));
                double price = Double.parseDouble(matcher.group(7));
                String curResult = String.format("%s: %s - %.2f", name, product, (quantity * price));
                result.add(curResult);
                total += quantity * price;
            }


            text = reader.readLine();

        }
        for (String s : result) {
            System.out.println(s);

        }
        System.out.printf("Total income: %.2f%n",total);
    }
}
