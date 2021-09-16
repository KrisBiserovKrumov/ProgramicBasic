package AssociativeArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class Legendary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] commands = reader.readLine().split(" ");
        Map<String,Integer>heroeCount = new HashMap<>();
        Map<String,Integer>secondHeroe = new TreeMap<>();

        heroeCount.putIfAbsent("motes",0);
        heroeCount.putIfAbsent("fragments",0);
        heroeCount.putIfAbsent("shards",0);


        for (int i = 0; i < commands.length - 1 ; i+=2) {
            String heroe = commands[i + 1].toLowerCase();
            Integer number = Integer.parseInt(commands[i]);

            if (heroe.equals("motes") || heroe.equals("fragments") || heroe.equals("shards")){

                heroeCount.put(heroe,heroeCount.get(heroe) + number);
                if (heroeCount.get(heroe) >=250){

                    if (heroe.equals("motes")){
                        System.out.println("Dragonwrath obtained!");
                    }else if (heroe.equals("fragments")){
                        System.out.println("Valanyr obtained!");
                    }else {
                        System.out.println("Shadowmourne obtained!");
                    }
                    heroeCount.put(heroe, heroeCount.get(heroe) - 250);
                   break;
                }
            }else {
                secondHeroe.putIfAbsent(heroe,0);
                secondHeroe.put(heroe,secondHeroe.get(heroe) + number);
            }
        }
        heroeCount.entrySet().stream().sorted((a,b)->{
            if (b.getValue() .equals(a.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue().compareTo(a.getValue());
        }).forEach(e->{
            System.out.println(e.getKey() + ": " + e.getValue());
        });

        secondHeroe.entrySet().stream().forEach(b->{
            System.out.println(b.getKey() + ": " + b.getValue());
        });



    }
}
