public class RegularEmployee extends Employee {

    public RegularEmployee(int wedge) {
        this.wedge = wedge;
    }

    public void accept(TreeVisitor treeVisitor) {
        treeVisitor.visit(this);
    }
}
