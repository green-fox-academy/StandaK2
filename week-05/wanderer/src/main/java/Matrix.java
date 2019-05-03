import java.util.Random;

public class Matrix {

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

//    public Matrix() {
//    }

    public void setValue(int x, int y, int value){
        Matrix.matrix[x][y] = value;
    }

    public static int getValue(int x, int y) {
        return Matrix.matrix[x][y];
    }

    public int getLenght() {
        return this.matrix.length;
    }

    // returns random coordinates on matrix to position enemies, checks also already full position
    public int[] giveMeRandomCoordinates() {
        boolean randomOnPath = false;
        int[] randomCoordinates = new int[2];

        while (!randomOnPath) {
            int randomI = (int) (Math.random() * matrix.length);
            int randomJ = (int) (Math.random() * matrix.length);
            if (this.matrix[randomI][randomJ] == 0 && (randomI != 0 && randomJ != 0)){
                randomCoordinates[1] = randomI;
                randomCoordinates[0] = randomJ;
                randomOnPath = true;
            }
        } return randomCoordinates;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.getLenght(); i++) {
            for (int j = 0; j < this.getLenght(); j++) {
                result += (this.getValue(i, j) + " ");
            }
            result += "\n";
        }
        return result;
    }
}