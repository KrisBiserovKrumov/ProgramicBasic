package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSynonyms2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String, List<String>> synonims = new HashMap<>();
        for (int i = 0; i < n * 2; i+=2) {
            String word = reader.readLine();
            String synonim = reader.readLine();
            if (!synonims.containsKey(word)){
                synonims.put(word,new ArrayList<>());
            }
            synonims.get(word).add(synonim);
        }
        synonims.forEach((word,synonimsBy) -> {
            System.out.print(word + " - ");
            System.out.println(String.join(", ",synonimsBy));
        });


    }
}
