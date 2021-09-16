package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordSinonims {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer count = Integer.parseInt(reader.readLine());
        Map<String, List<String >> sinonyms = new LinkedHashMap<>();

        for (int i = 0; i < count  ; i++) {
            String word = reader.readLine();
            String sin = reader.readLine();
            sinonyms.putIfAbsent(word,new ArrayList<>());
            sinonyms.get(word).add(sin);
        }
        sinonyms.entrySet().stream().forEach(e->{
            System.out.println(e.getKey() + " - " + e.getValue());
        });
    }
}
