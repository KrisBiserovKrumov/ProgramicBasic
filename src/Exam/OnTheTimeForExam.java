package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnTheTimeForExam {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int hourExam = Integer.parseInt(reader.readLine());
        int minExam = Integer.parseInt(reader.readLine());
        int hourArrive = Integer.parseInt(reader.readLine());
        int minArrive = Integer.parseInt(reader.readLine());

        int minTotalExam = hourExam * 60 + minExam;
        int minTotalArrive = hourArrive * 60 + minArrive;

        if (minTotalArrive > minTotalExam){
            System.out.println("Late");
            if (minTotalArrive - minTotalExam > 59) {
                int hour = (minTotalArrive - minTotalExam) / 60;
                int min = (minTotalArrive - minTotalExam) % 60;
                System.out.printf( "%d:%02d hours after the start", hour,min);
            }else {
                int min = minTotalArrive - minTotalExam;
                System.out.printf(" %d minutes after the start", min);
            }
        }else if (minTotalExam - minTotalArrive > 30){
            System.out.println("Early");
            if (minTotalExam - minTotalArrive > 59) {
                int hour = (minTotalExam - minTotalArrive) / 60;
                int min = ( minTotalExam - minTotalArrive)  % 60;
                System.out.printf("%d:%02d hours before the start", hour ,min);
            }else {
                int min =  minTotalExam - minTotalArrive;
                System.out.printf("%d minutes before the start", min);
            }

        }else {
            if ( minTotalArrive == minTotalExam) {
                System.out.println("On time");
            }else {
                int min =  minTotalExam - minTotalArrive;
                System.out.printf("On time %d minutes before the start", min);

            }
        }


    }
}
