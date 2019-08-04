public abstract class Tree {
    protected int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract void accept(TreeVisitor treeVisitor);

}
