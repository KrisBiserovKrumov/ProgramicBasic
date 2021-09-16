package ExamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BakingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bestQuality = new ArrayList<>();
        int bestTotalQuality = Integer.MIN_VALUE;
        int bestAverage = Integer.MIN_VALUE;
        int bestLenght = 0;

        while (true) {

            String line = scanner.nextLine();

            if (line.equals("Bake It!")) {

                break;
            }

            List<Integer> breads = Arrays.stream(line.split("#"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int totalQuality = breads.stream().mapToInt(Integer::intValue).sum();

            int average = 0;

            for (Integer bread : breads) {
                average += bread;
            }

            average /= breads.size();

            if (totalQuality > bestTotalQuality) {

                bestTotalQuality = totalQuality;
                bestAverage = average;
                bestLenght = breads.size();
                bestQuality = breads;

            } else if (totalQuality == bestTotalQuality) {

                if (average > bestAverage) {

                    bestAverage = average;
                    bestLenght = breads.size();
                    bestQuality = breads;

                } else if (average == bestAverage) {

                    if (breads.size() < bestLenght) {

                        bestLenght = breads.size();
                        bestQuality = breads;
                    }
                }
            }
        }

        System.out.printf("Best Batch quality: %d%n", bestTotalQuality);
        System.out.println(bestQuality.toString().replaceAll("[\\[\\],]", ""));
    }
}