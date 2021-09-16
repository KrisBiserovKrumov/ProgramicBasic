package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class result2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String module = reader.readLine();
        double numbStudents = Double.parseDouble(reader.readLine());
        double bonus = 0;
        double midGrate = 0;
        double totalGrate = 0;
        double weak = 0;
        double excellent = 0;
        double total = 0;

        if (module.equals("Programming basics")){
            bonus += 0.3;
        }else if (module.equals("Photoshop basics")){
            bonus += 0.2;
        }else if (module.equals("AdWords basics")){
            bonus += 0.4;
        }

        for (double i = 0; i < numbStudents; i++) {
            double grate = Double.parseDouble(reader.readLine());
            midGrate++;
            if (grate < 3.00){
                totalGrate += 2.00;
                weak++;
            }else if (grate > 6.00){
                    totalGrate += 6.00;
                    excellent++;

                    }
            else if (grate >= 5.50){
                excellent ++;
                }
                else{
                totalGrate += grate;
            }




            }


            double totalMidGrate = totalGrate / midGrate;
        total += totalMidGrate + bonus;


        if (total > 6.00){
            total += 6.00;
            }
            if (module.equals("Programming basics") || module.equals("Photoshop basics") || module.equals("AdWords basics")  ){
                System.out.printf("%s average score: %.2f%n", module , total);
                System.out.printf("Weak results: %.0f%n", weak);
                System.out.printf("Excellent results: %.0f",excellent);
            }
            else{
                System.out.printf("%s is invalid course name!", module );
            }



    }
}
