package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;


public class WordSynonyms {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map< String, List <String> >  synonims = new LinkedHashMap<>();
        int number = Integer.parseInt(reader.readLine());

        for (int i = 0; i < number ; i++) {
            String word = reader.readLine();
            String synonim = reader.readLine();

            synonims.putIfAbsent(word,new ArrayList<>());
            List<String> synonimsByWords = synonims.get(word);
            synonimsByWords.add(synonim);

        }
        synonims.forEach((word , synonymsByWord) ->{
            System.out.print(word + " - ");
            System.out.println(String.join(", ", synonymsByWord));

        });
    }
}
