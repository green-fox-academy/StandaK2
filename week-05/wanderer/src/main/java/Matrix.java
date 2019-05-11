import java.awt.*;

public class Matrix implements Drawable{

    private static int[][] matrix = {       {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                                            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
                                            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
                                            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
                                            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
                                            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
                                            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
                                            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
                                            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},};

    private Wall wall;
    private Path path;

    public Matrix(Wall wall, Path path ) {
        this.wall = wall;
        this.path = path;
    }

    public static int getValue(int x, int y) {
        return Matrix.matrix[y][x];
    }

    public static int getLenght() {
        return Matrix.matrix.length;
    }

    public static int[] giveMeRandomCoordinates() {
        boolean randomOnPath = false;
        int[] randomCoordinates = new int[2];

        while (!randomOnPath) {
            int randomI = (int) (Math.random() * matrix.length);
            int randomJ = (int) (Math.random() * matrix.length);
            if (Matrix.matrix[randomI][randomJ] == 0 && (randomI != 0 && randomJ != 0)){
                randomCoordinates[1] = randomI;
                randomCoordinates[0] = randomJ;
                randomOnPath = true;
            }
        } return randomCoordinates;
    }

    @Override
    public void draw(Graphics graphics) {

        for (int i = 0; i < Matrix.getLenght(); i++) {
            for (int j = 0; j < Matrix.getLenght(); j++) {
                this.wall.setCurrentPositionXY(i, j);
                this.path.setCurrentPositionXY(i, j);

                // draw wall on board
                if (Matrix.getValue(i, j) == 0) {
                    this.path.draw(graphics);
                }
                // draw path on board
                if (Matrix.getValue(i, j) == 1) {
                    this.wall.draw(graphics);
                }
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result += (this.getValue(i, j) + " ");
            }
            result += "\n";
        }
        return result;
    }
}