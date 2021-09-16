package ComplexCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointOnRectangleBorder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1 =Double.parseDouble(reader.readLine());
        double y1 =Double.parseDouble(reader.readLine());
        double x2 =Double.parseDouble(reader.readLine());
        double y2 =Double.parseDouble(reader.readLine());
        double x =Double.parseDouble(reader.readLine());
        double y =Double.parseDouble(reader.readLine());

        boolean IsOnLeftSide = (x == x1  && y >= y1 && y <= y2);
        boolean IsOnRightSide = (x == x2  && y >= y1 && y <= y2);
        boolean IsOnTopSide = (y == y1  && x >= x1 && x <= x2);
        boolean IsOnBottomSide = (y == y2 && x >= x1 && x <= x2);
        if (IsOnBottomSide || IsOnLeftSide || IsOnRightSide || IsOnTopSide){
            System.out.println("Border");
        }else
            System.out.println("Inside / Outside");
    }
}
