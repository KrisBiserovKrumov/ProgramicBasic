package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class textFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] repleasmand = reader.readLine().split(", ");
        String text = reader.readLine();

        for (String repleas : repleasmand){
            String star = repleas.replaceAll(".","*");
            text = text.replace(repleas,star);
        }
        System.out.println(text);
    }
}
