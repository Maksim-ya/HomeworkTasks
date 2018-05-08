package Task1_3.print;

import Task1_3.model.Pyramid;

public class PyramidPrint {
    public static void printPyramid(Pyramid pyramid){
        for (int i = 0; i < pyramid.getHeight(); i++) {
            for (int j = 0; j < pyramid.getLength(); j++) {
                System.out.print(pyramid.getPyramid()[i][j]);

            }
            System.out.println();
        }
    }
}
