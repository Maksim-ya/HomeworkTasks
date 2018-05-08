package Task1_4.print;

import Task1_4.matrix.Matrix;

public class MatrixMetods {

    public static void printMatrix(Matrix matrix){
        for (int i = 0; i < matrix.getHeight(); i++) {
            for (int j = 0; j < matrix.getHeight(); j++) {
                System.out.print(matrix.getMatrix()[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

