package ExamPreparation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int totalPieces = a * b;

        while (true){
            String command = reader.readLine();
            if (command.equals("STOP")){
                System.out.println(totalPieces + " pieces are left.");
                break;
            }
            totalPieces -= Integer.parseInt(command);
            if (totalPieces < 0 ){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));
                break;

            }
        }
    }
}
