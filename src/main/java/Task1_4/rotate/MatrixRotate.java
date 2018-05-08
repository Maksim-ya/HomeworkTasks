package Task1_4.rotate;


import Task1_4.matrix.Matrix;


public class MatrixRotate {

    public Matrix rotate(Matrix matrix) {
        int[][] rotatedMatrix = new int[matrix.getHeight()][matrix.getHeight()];

        for (int i = 0; i < matrix.getHeight(); i++) {
            for (int j = 0; j < matrix.getHeight(); j++) {

                rotatedMatrix[i][j] = matrix.getMatrix()[j][matrix.getHeight() - (i + 1)];

            }
        }
        for (int i = 0; i < matrix.getHeight(); i++) {
            for (int j = 0; j < matrix.getHeight(); j++) {
                matrix.getMatrix()[i][j] = rotatedMatrix[i][j];
            }
        }
        return matrix;
    }
}
