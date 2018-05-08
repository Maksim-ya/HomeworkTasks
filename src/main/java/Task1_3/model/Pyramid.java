package Task1_3.model;


import Task1_3.validator.CheckHeight;


public class Pyramid {
    char[][] pyramid;
    int height;
    int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getPyramid() {
        return pyramid;
    }

    public void setPyramid(char[][] pyramid) {
        this.pyramid = pyramid;
    }

    public Pyramid() {
    }

    public Pyramid(int height) {
        CheckHeight gN = new CheckHeight();
        int CheckedHeight = gN.checkHeight(height);
        this.height = CheckedHeight;
        this.length=2*CheckedHeight-1;
        pyramid = new char[CheckedHeight][2 * CheckedHeight - 1];


        for (int row = 0; row < CheckedHeight; row++) {
            char value = '\u0031';
            for (int column = 0; column < (2 * CheckedHeight - 1); column++) {
                if (column < CheckedHeight - row - 1) {
                    pyramid[row][column] = '\u0020';

                } else {
                    pyramid[row][column] = value;

                    if (column < (height - 1))
                        value++;

                    else{
                        value--;
                    if (value <='\u0030')
                        value = '\u0020';}
                }
            }

        }
    }

}
