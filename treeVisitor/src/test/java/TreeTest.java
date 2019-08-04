import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TreeTest {

    @Test
    public void test(){

        Tree leaf = new TreeLeaf(1);

        Tree tree = new TreeNode
                        (new TreeNode(
                                new TreeLeaf(1)
                                , new TreeLeaf(3)),
                        new TreeLeaf(2));

        CounterVisitor visitor = new CounterVisitor();

        tree.accept(visitor);
        assertEquals(2, visitor.getCounter());
    }
}
