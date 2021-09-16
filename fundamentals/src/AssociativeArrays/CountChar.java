package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().split(" ");
        Map<String,Integer> letters = new LinkedHashMap<>();


        for (int i = 0; i <line.length ; i++) {

            String[] text = line[i].split("");

            for (int j = 0; j < text.length ; j++) {
                String letter = text[j];
                if (!letters.containsKey(letter)){
                    letters.put(letter,0);
                }
                letters.put(letter,letters.get(letter)+1);


            }

        }
       for (Map.Entry<String,Integer>letter : letters.entrySet()){
           System.out.print(String.format("%s -> %d%n",letter.getKey(),letter.getValue()));
       }

    }
}
