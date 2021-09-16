package ExamDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class bakingFactory3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> bestQuality = new ArrayList<>();

        int bestsum = Integer.MIN_VALUE;
        int bestFormula = Integer.MIN_VALUE;
        int bestLenght = 0;


        while (true){
            int sum = 0;


            String formula = reader.readLine();
            if (formula.equals("Bake It!")){
                break;
            }
            List<Integer> numbers = Arrays.stream(formula.split("#")).map(Integer::parseInt).collect(Collectors.toList());

            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            int middleForm = sum / numbers.size();
            int linght = numbers.size();
            if (sum > bestsum){
                bestsum = sum;
                bestQuality = numbers;
                bestFormula = middleForm;
                bestLenght = linght;
            }
            else if (sum == bestsum){
                if (middleForm > bestFormula) {
                    bestsum = sum;
                    bestQuality = numbers;
                    bestFormula = middleForm;
                    bestLenght = linght;
                }

            }else if (sum == bestsum){
                if (middleForm > bestFormula) {
                    if (linght < bestLenght)
                    bestsum = sum;
                    bestQuality = numbers;
                    bestFormula = middleForm;
                    bestLenght = linght;
                }

            }
        }
        System.out.printf("Best Batch quality: %d%n",bestsum);
        for (Integer integer : bestQuality) {
            System.out.print(integer + " ");
        }





    }
}
