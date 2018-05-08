package Task7;


public class Node {
    private  int value;
    private NodeColor color;
    private Node parent;
    private Node leftSon;
    private Node rightSon;


    public Node() {

    }

    public Node(int value, NodeColor color) {
        this.value = value;
        this.color = color;
    }

    public boolean isFree() {
        return value == 0;
    }

    public boolean isLeftFree() {
        return leftSon == null ;
    }

    public boolean isRightFree() {
        return rightSon == null;
    }

    public boolean isParentFree() {
        return parent == null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeColor getColor() {
        return color;
    }

    public void setColor(NodeColor color) {
        this.color = color;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
        if (leftSon != null)
            leftSon.setParent(this);
    }
    public boolean isBlack() {
        return color == NodeColor.Black;
    }

    public void makeBlack() {
        color = NodeColor.Black;
    }

    public boolean isRed() {
        return color == NodeColor.Red;
    }

    public void makeRed() {
        color = NodeColor.Red;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
        if (rightSon != null)
            rightSon.setParent(this);
    }
    public Node getGrandFather(){
        if(parent != null)
        return parent.parent;
        return null;
    }
    public Node getUncle() {
        Node grandFather = getGrandFather();
        if(grandFather!= null)
        {
            if(grandFather.getLeftSon() == parent)
                return grandFather.rightSon;
            else if(grandFather.getRightSon() == parent)
                return grandFather.leftSon;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", color=" + color +
                ", parent=" + parent +
                ", leftSon=" + leftSon +
                ", rightSon=" + rightSon +
                '}';
    }
}
