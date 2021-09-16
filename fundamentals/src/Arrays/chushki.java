package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chushki {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        String[] stuff = new String[size];

        while (true) {
            String candidatePosition = reader.readLine();
            if (candidatePosition.equals("END")) {
                break;
            } else {
                int position = Integer.parseInt(candidatePosition);
                String item = reader.readLine();
                if (position > stuff.length - 1 || position < 0) {
                    System.out.println("Invalid position, try again!");
                } else {
                    stuff[position] = item;
                }
            }
        }
            String line = reader.readLine();

            while (!line.equals("END")){
                int position = Integer.parseInt(line);
                if (position < 0 || position > stuff.length - 1){
                    System.out.println("Invalid position , try again!");

                }else {
                    String item = stuff[position];
                    if (item != null) {
                        System.out.println(item.substring(Math.min(3, item.length() - 1),
                                Math.min(5, item.length())));
                    }else {
                        System.out.println("Invalid Item");
                    }
                }
                line = reader.readLine();

            }


    }
}
