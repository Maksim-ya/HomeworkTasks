package Task7;


public class MyRBTree {
    private Node root;
    private Node nill;

    public MyRBTree() {
        root = new Node();
        nill = new Node(0, NodeColor.Black);
        root.setParent(nill);
        root.setRightSon(nill);
        root.setLeftSon(nill);

    }

    public void insert(int i) {
        Node node = root;
        Node temp = nill;
        Node newNode = new Node(i, NodeColor.Red);
        while (node != null && node != nill && !node.isFree()) {
            temp = node;
            if (newNode.getValue() < node.getValue())
                node = node.getLeftSon();
            else {
                node = node.getRightSon();
            }
        }
        newNode.setParent(temp);
        if (temp == nill) {
            root.setValue(newNode.getValue());
        } else {
            if (newNode.getValue() < temp.getValue())
                temp.setLeftSon(newNode);
            else
                temp.setRightSon(newNode);
        }
        newNode.setLeftSon(nill);
        newNode.setRightSon(nill);
        fixInsert(newNode);
    }



    private void fixInsert(Node node) {
        Node temp;
        while (!node.isParentFree() && node.getParent().isRed()) {
            if (node.getParent() == node.getGrandFather().getLeftSon()) {
                temp = node.getGrandFather().getRightSon();
                if (temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeBlack();
                    node.getGrandFather().makeRed();
                    node = node.getGrandFather();
                } else {
                    if (node == node.getParent().getRightSon()) {
                        node = node.getParent();
                        leftRotate(this, node);
                    }
                    node.getParent().makeBlack();
                    node.getGrandFather().makeRed();
                    rightRotate(this, node.getGrandFather());
                }
            } else {
                temp = node.getGrandFather().getLeftSon();
                if (temp.isRed()) {
                    temp.makeBlack();
                    node.getParent().makeBlack();
                    node.getGrandFather().makeRed();
                    node = node.getGrandFather();
                } else {
                    if (node == node.getParent().getLeftSon()) {
                        node = node.getParent();
                        rightRotate(this, node);
                    }
                    node.getParent().makeBlack();
                    node.getGrandFather().makeRed();
                    leftRotate(this, node.getGrandFather());
                }
            }
        }
        root.makeBlack();
    }

    private static void leftRotate(MyRBTree tree, Node node) {
        Node nodeParent = node.getParent();
        Node nodeRight = node.getRightSon();
        if (nodeParent != tree.nill) {
            if (nodeParent.getLeftSon() == node)
                nodeParent.setLeftSon(nodeRight);
            else
                nodeParent.setRightSon(nodeRight);
        } else {
            tree.root = nodeRight;
            tree.root.setParent(tree.nill);
        }
        node.setRightSon(nodeRight.getLeftSon());
        nodeRight.setLeftSon(node);
    }

    private static void rightRotate(MyRBTree tree, Node node) {
        Node nodeParent = node.getParent();
        Node nodeLeft = node.getLeftSon();
        if (nodeParent != tree.nill) {
            if (nodeParent.getLeftSon() == node)
                nodeParent.setLeftSon(nodeLeft);
            else
                nodeParent.setRightSon(nodeLeft);
        } else {
            tree.root = nodeLeft;
            tree.root.setParent(tree.nill);
        }
        node.setLeftSon(nodeLeft.getRightSon());
        nodeLeft.setRightSon(node);
    }

    public void printTree(int height) {
        printTree(root, height);
    }


    private static void printTree(Node t, int height) {
        if (t != null) {
            for (int i = 0; i < height; i++) {
                System.out.print("   ");
            }
            System.out.println(t.getValue());
            height++;
            printTree(t.getLeftSon(), height);
            printTree(t.getRightSon(), height);
        }
    }

}
