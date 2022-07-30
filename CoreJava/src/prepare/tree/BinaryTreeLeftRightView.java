package prepare.tree;

public class BinaryTreeLeftRightView {

	public static void main(String[] args) {
		CreateTree ctree = new CreateTree();
		Node root = ctree.createTree();

		TreeView view = new TreeView();
		view.maxLevel = 0;
		view.leftView(root, 1);
		System.out.println();
		view.maxLevel = 0;
		view.rightView(root, 1);

		/*
		 * 	1
		 * 
		 * 2 3
		 * 
		 * 21
		 */

	}

}

class TreeView {

	int maxLevel = 0;

	public void leftView(Node root, int level) {

		if (root == null) {
			return;
		}

		if (maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}

		leftView(root.left, level + 1);
		leftView(root.right, level + 1);

	}

	public void rightView(Node root, int level) {

		if (root == null) {
			return;
		}

		if (maxLevel < level) {
			System.out.print(root.data + " ");
			maxLevel = level;
		}
		leftView(root.right, level + 1);
		leftView(root.left, level + 1);

	}

}
