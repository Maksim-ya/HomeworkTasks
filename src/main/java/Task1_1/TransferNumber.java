package Task1_1;

/**
 *
 */
public class TransferNumber {
    public void getTransferedNumber(int number, int basis) {

        CheckNumber gN = new CheckNumber();
        int CheckedNumber = gN.checkNumber(number);

        char[] arr = new char[(int) (Math.log(CheckedNumber) / Math.log(basis)) + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (char) (CheckedNumber % basis);

            if(basis==16){
                switch (arr[i]){
                    case 10:arr[i]='A';break;
                    case 11:arr[i]='B';break;
                    case 12:arr[i]='C';break;
                    case 13:arr[i]='D';break;
                    case 14:arr[i]='E';break;
                    case 15:arr[i]='F';break;
                }
            }

            CheckedNumber = CheckedNumber / basis;
        }
        for (int index : arr)
            if(basis==16&index>9){
                System.out.print((char)index);
            }
            else System.out.print(index);
        System.out.println();

    }
}
