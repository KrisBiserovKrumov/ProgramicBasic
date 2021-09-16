package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());
        double[] money = new double[size];

        for (int i = 0; i < money.length ; i++) {
            money[i] = Double.parseDouble(reader.readLine());
        }

            int startPosicion = Integer.parseInt(reader.readLine());
            String direcion = reader.readLine();
            double sum = money[startPosicion];

            while (!direcion.equals("END")){
                if (direcion.equals("L")){
                    if (startPosicion == 0){
                        System.out.println("You can not, move right!");
                    }else {
                        startPosicion--;
                        sum += money[startPosicion];
                    }
                }else if (direcion.equals("R")) {
                    if (startPosicion == money.length - 1){
                        System.out.println("You can not, move left!");
                    }else {
                        startPosicion++;
                        sum += money[startPosicion];
                    }

                }else {
                    System.out.println("Invalid direction");
                }
                direcion = reader.readLine();
            }
            System.out.println(sum);


    }
}
