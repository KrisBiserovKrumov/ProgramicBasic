package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoreWars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int dishes = 0;
        int cleaning = 0;
        int laundry = 0;

        while (!line.equals("wife is happy")){

            if (line.contains("{") && line.contains("}")){
                int beginIndex = line.indexOf("{") + 1;
                int endIndex = line.indexOf("}");
                String data = line.substring(beginIndex,endIndex);

                for (int i = 0; i <data.length() ; i++) {
                    if (Character.isDigit(data.charAt(i))){
                        // така намираме числото на което отговаря и;
                        laundry += data.charAt(i) - '0';
                    }
                }
            }else if (line.contains("<") && line.contains(">")){
                int begin = line.lastIndexOf("<") + 1;
                int end = line.indexOf(">");

                String data = line.substring(begin,end);
                
                if (IsValid(data)){
                    for (int i = 0; i <data.length() ; i++) {
                        if (Character.isDigit(data.charAt(i))){
                            // така намираме числото на което отговаря и;
                            dishes += data.charAt(i) - '0';
                        }
                    }
                }
            }else if (line.contains("[") && line.contains("]")){
                int begin = line.lastIndexOf("[") + 1;
                int end = line.indexOf("]");

                String data = line.substring(begin,end);

                if (IsValidCleaning(data)){
                    for (int i = 0; i <data.length() ; i++) {
                        if (Character.isDigit(data.charAt(i))){
                            // така намираме числото на което отговаря и;
                            cleaning += data.charAt(i) - '0';
                        }
                    }
                }
            }
            line = reader.readLine();
        }
        System.out.println("Doing the dishes - " + dishes + " min.");
        System.out.println("Cleaning the house - " + cleaning + " min.");
        System.out.println("Doing the laundry - " + laundry + " min.");
        System.out.println("Total - " + (dishes + cleaning + laundry) +" min.");
    }

    private static boolean IsValidCleaning(String data) {

        for (int i = 0; i < data.length(); i++) {
            //Ако между знаците няма главни бъкви или цифри връща грешка, ако е вярно се качва горе на задачата;
            if (!Character.isUpperCase(data.charAt(i)) && !Character.isDigit(data.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean IsValid(String data) {
        for (int i = 0; i < data.length(); i++) {
            //Ако между знаците няма главни бъкви или цифри връща грешка, ако е вярно се качва горе на задачата;
            if (!Character.isLowerCase(data.charAt(i)) && !Character.isDigit(data.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
