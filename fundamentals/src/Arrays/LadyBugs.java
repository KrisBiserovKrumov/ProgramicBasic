package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LadyBugs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fieldSize = Integer.parseInt(reader.readLine());
        String[] indexes = reader.readLine().split(" ");
        int[] field = new int[fieldSize];

        for (int i = 0; i < indexes.length ; i++) {
            int index = Integer.parseInt(indexes[i]);
            if (index >= 0 && index < fieldSize){
                field[index] = 1;
            }
            
        }
        String comand = reader.readLine();

        while (!comand.equals("end")){

            String[] cmdArgs = comand.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);

            String cmd = cmdArgs[1];
            int lenght = Integer.parseInt(cmdArgs[2]);
            if (index < 0 || index > fieldSize - 1  || field[index] == 0){
                comand = reader.readLine();
                continue;

            }
            field[index] = 0;
           if (cmd.equals("right")) {
               index += lenght;
               while (index < fieldSize && field[index] == 1) {
                   index += lenght;
               }
               if (index < fieldSize) {
                   field[index] = 1;
               }
           }else {
               index -= lenght;
               while (index >= 0 && field[index] == 1){
                   index -= lenght;

               }
               if (index >= 0) {
                   field[index] = 1;
               }
           }
            comand = reader.readLine();
        }
        for (int i = 0; i < field.length ; i++) {
            System.out.print(field[i] + " ");
            
        }
        System.out.println();
    }
}
