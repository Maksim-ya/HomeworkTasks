package Task1_4.main;


import Task1_4.matrix.Matrix;
import Task1_4.rotate.MatrixRotate;
import Task1_4.print.MatrixMetods;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(10);
        MatrixMetods.printMatrix(matrix);
        System.out.println("__________________________________");
        MatrixRotate matrixRotate =new MatrixRotate();
        Matrix rotatedMatrix = matrixRotate.rotate(matrix);
        MatrixMetods.printMatrix(rotatedMatrix);

    }

}
