package DrawingFigureswithLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOfStars3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        for (int row = 1; row <= n ; row++) {
            System.out.print("*");
            for (int cow = 1; cow <= n - 1 ; cow++) {
                System.out.print(" *");
        }
            System.out.println();
        }
    }

}
