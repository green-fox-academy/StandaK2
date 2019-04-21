//Create a function named isSymmetric that takes an n×n integer matrix (two dimensional array/list) as a parameter
// and returns true if the matrix is symmetric or false if it is not.


class SymmetricMatrix {

    static int maxNumber = 100;

    public static void main(String[] args) {

        int matrix1[][] = {{1, 0, 1},
                            {0, 2, 2},
                            {1, 2, 5}};

        int matrix2[][] = {{7, 7, 7},
                            {6, 5, 7},
                             {1, 2, 1}};

        System.out.println("Matrix 1: " + isSymmetric(matrix1, 3));
        System.out.println("Matrix 2: " + isSymmetric(matrix2, 3));
    }

    // Fills transpose of matrix[N][N] in transMatrix[N][N]
    static void transpose(int matrix[][], int transMatrix[][], int N) {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                transMatrix[i][j] = matrix[j][i];
    }

    // Returns true if matrix[N][N] is symmetric, else false
    static boolean isSymmetric(int matrix[][], int N) {
        int transMatrix[][] = new int[N][maxNumber];
        transpose(matrix, transMatrix, N);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (matrix[i][j] != transMatrix[i][j])
                    return false;
        return true;
    }
}