public class Manager extends Employee {
    private Employee left;
    private Employee right;

    public Manager(int wedge, Employee left, Employee right) {
        this.wedge = wedge;
        this.left = left;
        this.right = right;
    }

    public void accept(TreeVisitor treeVisitor) {
            treeVisitor.visit(this);
            this.left.accept(treeVisitor);
            this.right.accept(treeVisitor);
    }
}
