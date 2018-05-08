package Task1_3.main;


import Task1_3.model.Pyramid;
import Task1_3.print.PyramidPrint;

public class Main {
    public static void main(String[] args){
        Pyramid pyramid =new Pyramid(8);
        PyramidPrint.printPyramid(pyramid);
    }
}
