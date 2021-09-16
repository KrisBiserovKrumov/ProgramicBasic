package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OddOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = reader.readLine().split(" ");

        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String wordInToLowerCase = word.toLowerCase();
            if (counts.containsKey(wordInToLowerCase)){
                counts.put(wordInToLowerCase,counts.get(wordInToLowerCase) + 1);
            }else {
                counts.put(wordInToLowerCase , 1 );
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : counts.entrySet()) {
            if (stringIntegerEntry.getValue() % 2 == 1){
                odds.add(stringIntegerEntry.getKey());
            }
        }

        odds.forEach(e -> {
            System.out.print(String.join(", ",e));
        });
        System.out.println();
        for (int i = 0; i < odds.size() ; i++) {
            System.out.print(String.join(", ",odds.get(i)));
            if (i < odds.size() - 1){
                System.out.print(", ");
            }

        }
    }
}
