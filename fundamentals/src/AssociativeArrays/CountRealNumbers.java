package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class CountRealNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        LinkedHashMap<Character,Integer> charBy = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char lettet = text.charAt(i);
            if (lettet != ' ') {
                if (!charBy.containsKey(lettet)) {
                    charBy.put(lettet, 1);
                } else {
                    charBy.put(lettet, charBy.get(lettet) + 1);
                }

            }
        }
        for (Character character : charBy.keySet()) {
            System.out.println(String.format("%c -> %d",character,charBy.get(character)));
            
        }
    }
}
