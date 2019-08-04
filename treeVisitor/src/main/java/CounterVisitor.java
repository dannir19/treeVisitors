public class CounterVisitor implements TreeVisitor {

    private int counter = 0;

    public void visit(TreeLeaf treeLeaf) {
        counter++;
    }

    public void visit(TreeNode treeNode) {
        counter += 2;
    }

    public int getCounter() {
        return counter;
    }
}
