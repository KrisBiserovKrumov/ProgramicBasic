package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kamino {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sequenceLenght = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int bestLengt = 0;
        String bestDnas = "";
        int bestIndex = 0;
        int bestSum = 0;
        int bestCounter = 0;
        int counter = 0;




        while (!line.equals("Clone them!")){
            counter++;

            String sequence = line.replaceAll("!", "");
            String[] dnas = sequence.split("0");

            int maxLenght = 0;
            int sum = 0;
            String bestLocal ="";
            for (int i = 0; i < dnas.length ; i++) {
                if (dnas[i].length() > maxLenght) {
                    maxLenght = dnas[i].length();
                    bestLocal = dnas[i];
                }
                sum += dnas[i].length();
            }
            int beginIndex = sequence.indexOf(bestLocal);
                if (maxLenght > bestLengt){
                    bestLengt = maxLenght;
                    bestDnas = sequence;
                    bestIndex = beginIndex;
                    bestSum = sum;
                    bestCounter = counter;
                }else if (maxLenght == bestLengt && (beginIndex < bestIndex || sum > bestSum)){
                    bestLengt = maxLenght;
                    bestDnas = sequence;
                    bestIndex = beginIndex;
                    bestSum = sum;
                    bestCounter = counter;
                }
                else if (counter == 1){
                    bestLengt = maxLenght;
                    bestDnas = sequence;
                    bestIndex = beginIndex;
                    bestSum = sum;
                    bestCounter = counter;

                }
            line = reader.readLine();
            }
        System.out.println(String.format("Best DNA sample " +
                "%d with sum: %d.",bestCounter,bestSum));
        for (int i = 0; i <bestDnas.length() ; i++) {
            System.out.print(bestDnas.charAt(i) + " ");

        }
        System.out.println();
    }
}
