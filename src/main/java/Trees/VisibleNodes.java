/* In a binary tree, if in the path from the root to the node A, there is no
 * node with value greater than A's value, then A is a visible node. We need
 * to count the number of visible nodes in a binary tree.
 */

package Trees;

class Tree {
    int val;
    Tree left;
    Tree right;

    Tree(int x) {
        val = x;
        this.left = null;
        this.right = null;
    }

    public void add(int value) { //binarysearchtree
        if (value < this.val) {
            if (this.left != null) {
                this.left.add(value);
            } else {
                this.left = new Tree(value);
            }
        } else {
            if (this.right != null) {
                this.right.add(value);
            } else {
                this.right = new Tree(value);
            }
        }
    }
}


public class VisibleNodes {

    public static int solution(Tree T, int max) {
        if (T == null) return 0;

        int num = 0;

        if (T.val >= max) {
            num = 1;
            max = T.val;
        }

        return num + solution(T.left, max) + solution(T.right, max);
    }

    public static void main(String[] args) {
        Tree tree_root = new Tree(5);
        for (int i = 0; i < 10; i++) {
            tree_root.add(i);
        }
        System.out.println(solution(tree_root, tree_root.val));
    }

}
