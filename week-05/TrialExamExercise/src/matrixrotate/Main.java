package matrixrotate;

//Create a function named rotateMatrix that takes an n×n integer matrix (array of arrays) as
//        parameter and returns a matrix which elements are rotated 90 degrees clockwise.

public class Main {
    public static void main(String[] args) {

        int[][] origMatrix = {  {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};

        int[][] rotateMatrix = rotateMatrix(origMatrix);
        System.out.println(matrixToString(rotateMatrix));
    }

    //function that rotates 9-element 2-dim matrix 90 degrees clockwise
    public static int[][] rotateMatrix(int[][] origMatrix) {

        int[][] newMatrix = new int[origMatrix.length][origMatrix[0].length];

        int lastColIndex = origMatrix[0].length - 1;

        for (int i = 0; i < origMatrix.length; i++) {
            for (int j = 0; j < origMatrix[i].length; j++) {
                if (j == 0) {
                    newMatrix[i][j] = origMatrix[j + lastColIndex][i];
                } else if (j == lastColIndex) {
                    newMatrix[i][j] = origMatrix[j - lastColIndex][i];
                } else {
                    newMatrix[i][j] = origMatrix[j][i];
                }
            }
        }
        return newMatrix;
    }

    // function printing out 2-dim matrix
    public static String matrixToString(int[][] Matrix) {
        String result = "";

        for (int[] array : Matrix) {
            for (int element : array) {
                result += element + " ";
            }
            result += "\n";
        }
        return result;
    }
}