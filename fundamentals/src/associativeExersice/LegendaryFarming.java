package associativeExersice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> keyRegants = new HashMap<>();
        Map<String,Integer> junk = new TreeMap<>();

        boolean IsObtained = false;

        keyRegants.put("motes",0);
        keyRegants.put("fragments",0);
        keyRegants.put("shards",0);

        while (!IsObtained) {

            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < line.length - 1; i += 2) {
                int quantity = Integer.parseInt(line[i]);
                String heroe = line[i + 1].toLowerCase();

                if (heroe.equals("motes") || heroe.equals("shards") || heroe.equals("fragments")) {
                    keyRegants.put(heroe, keyRegants.get(heroe) + quantity);

                    if (keyRegants.get(heroe) >= 250) {
                        keyRegants.put(heroe, keyRegants.get(heroe) - 250);
                        if (heroe.equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        } else if (heroe.equals("shards")) {
                            System.out.println("•Shadowmourne obtained!");
                        } else {
                            System.out.println("Valanyr obtained!");
                        }
                        IsObtained = true;
                        break;

                    }
                } else {


                    if (!junk.containsKey(heroe)) {
                        junk.putIfAbsent(heroe, quantity);
                    } else {
                        junk.put(heroe, junk.get(heroe) + quantity);

                    }

                }
            }
        }

      keyRegants.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()
              .thenComparing(Map.Entry.comparingByKey())).forEach(e -> {
          System.out.printf("%s: %d%n",e.getKey(),e.getValue());
      });

        junk.forEach((k,v)->{
                System.out.printf("%s: %d%n",k,v);
        });



    }
}
