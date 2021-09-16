package DrawingFigureswithLoops;

public class RectangleOfStars {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
