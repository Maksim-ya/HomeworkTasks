package Task1_4.matrix;


import java.util.Random;

public class Matrix {
    int[][] matrix;
    int height;

    public Matrix() {
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Matrix(int size) {
        matrix = new int[size][size];
        height = size;
        Random random = new Random();
        for (int i = size - 1; i >= 0; i--) {
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = random.nextInt(1000);
            }
            matrix[i] = arr;
        }
    }

}

