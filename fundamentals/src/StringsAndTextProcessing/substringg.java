package StringsAndTextProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class substringg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        String text = reader.readLine();
        while (text.contains(word)){
          text = text.replace(word,"");
        }
        System.out.println(text);
    }
}
