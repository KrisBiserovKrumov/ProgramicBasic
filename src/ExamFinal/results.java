package ExamFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class results {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String type = reader.readLine();
        double n = Double.parseDouble(reader.readLine());
        double bonus = 0;
        double note2 = 0;
        double sum = 0;
        double slab = 0;
        double top = 0;



        for (double i = 0; i < n ; i++) {
            double note = Double.parseDouble(reader.readLine());
            sum++;
            if (note < 3.00){
                note2 += 2;
                slab++;
                }else  if (note >= 6.00){
                note2 += 6;
                top++;
            }else if (note >= 5.50) {
                top++;
                note2 += note;
            }
            else {
                note2 += note;
            }
            }
        double total = note2 / sum;
        switch (type) {
            case "Programming basics":
                bonus += 0.30;
                break;
            case "Photoshop basics":
                bonus += 0.20;
                break;
            default:
                bonus += 0.40;
                break;
        }
        double finalNote = total + bonus;
        if (finalNote > 6.00){
            finalNote = 6.00;
        }
        if (type.equals("Programming basics") || type.equals("Photoshop basics") || type.equals("AdWords basics")) {

            System.out.printf("%s average score: %.2f%n", type, finalNote);
            System.out.printf("Weak results: %.0f%n", slab);
            System.out.printf("Excellent results: %.0f", top);
        }else{
            System.out.printf("%s is invalid course name!",type);
        }
    }
}
