package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointInFigure {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        boolean insideBottom = (x > 0 && x < h * 3 && y > 0 && y < h);
        boolean insideTop = (x > h && x < h * 2 && y > 0 && y < h * 4);
        boolean outsideBottom = (x < 0 || x > h * 3 || y < 0 || y > h);
        boolean outsideTop = (x < h || x > h * 2 || y < 0 || y > h * 4);


        if (insideBottom || insideTop){
            System.out.println("inside");
        }else if (outsideBottom && outsideTop){
            System.out.println("outside");
        }else
            System.out.println("border");

    }

}
