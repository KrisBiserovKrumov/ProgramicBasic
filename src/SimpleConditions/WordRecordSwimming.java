package SimpleConditions;

import java.util.Scanner;

public class WordRecordSwimming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordsec = Double.parseDouble(scan.nextLine());
        double meturs = Double.parseDouble(scan.nextLine());
        double timesec = Double.parseDouble(scan.nextLine());

        double totalSec = meturs * timesec;
        double totalsec2 = Math.floor(meturs / 15) * 12.5;
        double totalsec3 = totalSec + totalsec2;
        double fatal = totalsec3 - recordsec;

      if (totalsec3 >= recordsec){
          System.out.printf("No, he failed! He was %.2f seconds slower.",fatal);
      }else
          System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalsec3);
    }
}
