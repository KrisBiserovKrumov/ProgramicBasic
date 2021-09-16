package SimpleConditions;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine()) + 15;
        if (min > 59) {
            hour++;
            min = min -60;
            if (hour > 23){
                hour = 0;
            }
        }
        if (min < 10){
            System.out.println(hour + ":0" + min);
        }else
            System.out.println(hour + ":" + min);
    }
}
