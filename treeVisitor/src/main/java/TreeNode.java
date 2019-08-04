public class TreeNode extends Tree {
    private Tree left;
    private Tree right;

    public TreeNode(Tree left, Tree right) {
        this.left = left;
        this.right = right;
    }

    public void accept(TreeVisitor treeVisitor) {
            treeVisitor.visit(this);
            this.left.accept(treeVisitor);
            this.right.accept(treeVisitor);
    }
}
