package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharactersRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char begin = reader.readLine().charAt(0);
        char end = reader.readLine().charAt(0);
        if (begin > end){
            char temp = begin;
            begin = end;
            end = temp;
        }
        print(begin,end);

    }
    public static void  print ( char begin , char end){
        begin++;

        for (char i = begin; i < end; i++) {
            System.out.print(i + " ");
        }


    }
}
