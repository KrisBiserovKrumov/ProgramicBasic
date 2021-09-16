package ExamDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BakingFactory2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int maxSum = Integer.MIN_VALUE;
        double maxmiddleSum = Double.MAX_VALUE;
        int minLenght = Integer.MIN_VALUE;
        int[] sequence = null;
        int newsum = 0;

        while (!line.equals("Bake It!")){
            String[] line2 = line.split("#");
            int[] numbers = new int[line2.length];
            for (int i = 0; i < line2.length ; i++) {
                numbers[i] = Integer.parseInt(line2[i]);
            }
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            double middleSum = sum / (double) numbers.length;
            if (sum > maxSum){
                maxSum = sum;
                maxmiddleSum = middleSum;
                minLenght = numbers.length;
                sequence = numbers;
            } else if (sum == maxSum){
                if (middleSum > maxmiddleSum) {
                    maxSum = sum;
                    maxmiddleSum = middleSum;
                    minLenght = numbers.length;
                    sequence = numbers;
                }else if (middleSum == maxmiddleSum){
                    if (numbers.length < minLenght){
                        maxSum = sum;
                        maxmiddleSum = middleSum;
                        minLenght = numbers.length;
                        sequence = numbers;
                    }
                }
            }if (sum >= newsum){
                newsum = sum;
            }
            sum = 0;


            line = reader.readLine();

        }
        System.out.printf("Best Batch quality: %d%n",newsum);
        for (int i : sequence) {
            System.out.print(i + " ");

        }

    }
}
