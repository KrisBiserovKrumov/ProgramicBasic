package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharInString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        Map<Character,Integer> colect = new LinkedHashMap<>();

        for (int i = 0; i <line.length() ; i++) {
            char letter = line.charAt(i);
            if (letter != ' '){
                if (!colect.containsKey(letter)){
                    colect.put(letter,1);
                }else {
                    colect.put(letter,colect.get(letter) + 1);
                }
            }

        }
        for (Character character : colect.keySet()) {
            System.out.printf( " %c -> %d%n",character,colect.get(character));
        }




    }
}
