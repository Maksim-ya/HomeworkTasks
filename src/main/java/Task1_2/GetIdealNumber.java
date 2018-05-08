package Task1_2;


public class GetIdealNumber {
    public void getIdealNumber(int number){

        CheckNumber cN = new CheckNumber();
        int checkedNumber =cN.checkNumber(number);
        int [] arr = new int[20];
        int count=-1;
        for (int idealNumber = 2; idealNumber <=checkedNumber ; idealNumber++) {
            int summa =1;
            for (int devider = 2; devider < idealNumber; devider++) {
                if(idealNumber%devider==0){
                    summa +=devider;
                }
            }
            if (summa==idealNumber){
                arr[++count]=idealNumber;
            }

        }
        for (int  i =0; i<=count; i++){
            System.out.println(arr[i]);
        }
    }
}
