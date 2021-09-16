package Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlineEducation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        String type2 = reader.readLine();
        int b = Integer.parseInt(reader.readLine());
        String type3 = reader.readLine();
        int c = Integer.parseInt(reader.readLine());

         int totalOnline = 0;
         int totalOnsite = 0;
          if (type.equals("onsite")){
              totalOnsite = totalOnsite + a;
          }else {
              totalOnline = totalOnline + a;
          }
        if (type2.equals("onsite")){
            totalOnsite = totalOnsite + b;
        }else {
            totalOnline = totalOnline + b;
        }
        if (type3.equals("onsite")){
            totalOnsite = totalOnsite + c;
        }else {
            totalOnline = totalOnline + c;
        }
        int diff = totalOnsite - 600;
          if (diff > 0 ){
              totalOnsite = totalOnsite - diff;
              totalOnline = totalOnline + diff;
          }
        System.out.println("Online students: " + totalOnline);
        System.out.println("Onsite students: " + totalOnsite);

        int totalStudents = a + b + c;

        System.out.println("Total students: " + totalStudents);
    }
}
