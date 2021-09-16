package finalExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExerciseTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();


        while (!line.equals("end")){
            String[] nameSong = line.split(":");
            String name = nameSong[0];
            String song = nameSong[1];
            String newText = "";
            String endText ="";

            int lengt = 0;
            for (int i = 0; i <name.length() ; i++) {
                lengt += 1;
            }

            newText = line.replace(":","@");
            for (int i = 0; i < newText.length() ; i++) {
                char symbol = newText.charAt(i);
                if (symbol == '@' || symbol ==' ') {
                    endText += (char)(newText.charAt(i));

                }else {
                    if ((newText.charAt(i) + lengt > 'z') || (newText.charAt(i) + lengt > 'Z')){
                        int one = newText.charAt(i) + lengt - 'z';
                        endText += (char) (newText.charAt(i) + one);
                        int two = newText.charAt(i) + lengt - 'Z';
                        endText += (char) (newText.charAt(i) + two);
                    }else {

                        endText += (char) (newText.charAt(i) + lengt);
                    }
                }
            }
            System.out.println(endText);

            line = reader.readLine();
        }

    }




}
