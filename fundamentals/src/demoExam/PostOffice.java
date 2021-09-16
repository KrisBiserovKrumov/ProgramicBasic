package demoExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostOffice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = reader.readLine().split("\\|");
        String firstpart = parts[0];
        String secondPart = parts[1];
        String thirdPard = parts[2];

        String firstLetter = "";

        for (int i = 0; i <firstpart.length() ; i++) {
            char symbol = firstpart.charAt(i);

            if (symbol == '#' || symbol == '$' || symbol == '%' || symbol == '*' || symbol == '&' ){
               // По този начин се намира затварящия индекс, не първия срещнат;
                int index = firstpart.indexOf(symbol,i + 1);

                if (index != -1){
                    // и + 1 защото не ни трябва знака преди бъквите;
                    firstLetter = firstpart.substring(i + 1,index);

                }
            }
        }
        //думите от третата част;
        String[] words = thirdPard.split(" ");

        for (int i = 0; i < firstLetter.length(); i++) {
            //намираме числата който отговарят на буквите от firstLetter;
            String asciiCode = (int) firstLetter.charAt(i)+ "";
            int index = secondPart.indexOf(asciiCode);

            int lenght = 0;
            while (index != -1){

                char firsSymbol = secondPart.charAt(index + 3);
                char secondSymbol = secondPart.charAt(index + 4);

                if (Character.isDigit(firsSymbol) && Character.isDigit(secondSymbol)){
                    //намираме дължината на следващата дума която довавяме към главната;
                    lenght = Integer.parseInt(secondPart.substring(index + 3,index + 5));
                    break;
                }else {
                    //търсим следващото число;
                    index = secondPart.indexOf(asciiCode,index + 1);
                }
            }
            //записваме главната буква;
            char bigLetter = firstLetter.charAt(i);

            for (int j = 0; j <words.length ; j++) {
                // виждаме дали думата от третата част отгорава главната буква и дължината;
                if (words[j].charAt(0) == bigLetter && words[j].length() == lenght + 1){
                    System.out.println(words[j]);
                    break;
                }

            }

        }
    }
}
