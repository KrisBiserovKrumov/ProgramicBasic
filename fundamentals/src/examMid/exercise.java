package examMid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class exercise {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);;
        List<String> frase = Arrays.stream(scan.nextLine().split(",")).map(String::trim).collect(Collectors.toList());
        String line = scan.nextLine();



        while (!line.equals("Retire!")){
            String[] token = line.split(" - ");
            if (token[0].equals("Start")){
                if (!frase.contains(token[1])){
                    frase.add(token[1]);
                }
            }else if (token[0].equals("Complete")){
                frase.remove(token[1]);
            }

            else if (token[0].equals("Side Quest")){
                 String[]quest = token[1].split(":");
                if (frase.contains(quest[0])){
                    int index = frase.indexOf(quest[0]);
                    if (!frase.contains(quest[1])) {
                        frase.add(index  + 1, quest[1]);
                    }
                }
             }
            else if (token[0] .equals("Renew")){
                if (frase.contains(token[1])){
                    frase.remove(token[1]);
                    frase.add(token[1]);
                }
            }


            line = scan.nextLine();
        }

        System.out.println(String.join(", ", frase));
    }
}
