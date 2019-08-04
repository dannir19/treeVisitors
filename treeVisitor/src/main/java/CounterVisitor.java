public class CounterVisitor implements TreeVisitor {

    private int counter = 0;

    public void visit(RegularEmployee treeLeaf) {
        counter++;
    }

    public void visit(Manager treeNode) { }

    public int getCounter() {
        return counter;
    }
}
