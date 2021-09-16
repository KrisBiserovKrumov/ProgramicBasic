package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ANDProcessors2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double numProsesor = Double.parseDouble(reader.readLine());
        double numworks = Double.parseDouble(reader.readLine());
        double numDays = Double.parseDouble(reader.readLine());
        double hours = numworks * numDays * 8;
        double totalProcesor = Math.floor(hours / 3);

        if (totalProcesor < numProsesor){
            double lose = (numProsesor - totalProcesor) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", lose);
        }else  {
            double prifit = (totalProcesor - numProsesor) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", prifit);
        }

    }
}
