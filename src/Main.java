
public class Main {
    public static void main(String[] args) {
        MatrixChecker matrixChecker = new MatrixChecker();

//        System.out.println(matrixChecker.isSymmetrical(new int[][]{{1, 2, 3}, {3, 2, 1}}));

        int matrix[][] = {{1, 2, 3}, {3, 2, 1}};

        System.out.println(matrixChecker.isSymmetrical(matrix));

    }
}