package Task7;



public class Main {


    public static void main(String[] args) {
       MyRBTree myRBTree = new MyRBTree();
        for (int i = 10; i >0 ; i--) {
            myRBTree.insert(i);
        }
        System.out.println(myRBTree);
        myRBTree.printTree(0);
    }
}
