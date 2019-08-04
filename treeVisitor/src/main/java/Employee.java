public abstract class Employee {
    protected int wedge;

    public int getWedge() {
        return wedge;
    }

    public void setWedge(int wedge) {
        this.wedge = wedge;
    }

    public abstract void accept(TreeVisitor treeVisitor);

}
