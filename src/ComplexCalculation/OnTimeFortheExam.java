package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnTimeFortheExam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hourForExam = Integer.parseInt(reader.readLine());
        int minForExam = Integer.parseInt(reader.readLine());
        int arrivaHour = Integer.parseInt(reader.readLine());
        int arrivaMin = Integer.parseInt(reader.readLine());

        int examTotalMinutes = hourForExam * 60 + minForExam;
        int arrivaTotalMinutes = arrivaHour * 60 + arrivaMin;

        int differents = examTotalMinutes - arrivaTotalMinutes;

        if (differents > 30){
            System.out.println("Early");
            if (differents > 59){
                int hours = differents / 60;
                int min = differents % 60;
                System.out.printf("%d:%02d hours before the start", hours,min);
            }else {
                System.out.printf("%d minutes before the start", differents);
            }
        }else if (differents < 0){
            System.out.println("Late");

            int minutes = Math.abs(differents);

            if (minutes > 59){
                int hours = minutes / 60;
                int min = minutes % 60;
                System.out.printf("%d:%02d hours after the start", hours,min);
            }else {
                System.out.printf("%d minutes after the start", minutes);
            }
        }else {
            System.out.println("On time");

            if (differents > 0){
                System.out.printf("%d minutes before the start", differents);
            }
        }
    }
}
