public class TreeLeaf extends Tree {

    public TreeLeaf(int value) {
        this.value = value;
    }

    public void accept(TreeVisitor treeVisitor) {
        treeVisitor.visit(this);
    }
}
