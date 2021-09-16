package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class sinonim {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        Map<String , List<String> > sinonimByWord = new LinkedHashMap<>();

        while (a-- > 0){
            String word = reader.readLine();
            String sinonim = reader.readLine();
            sinonimByWord.putIfAbsent(word,new ArrayList<>());
            sinonimByWord.get(word).add(sinonim);
        }

        sinonimByWord.forEach((word , synonims)-> {
            System.out.print(word + " - ");
            System.out.println(String.join(", ", synonims));
        });
    }
}
