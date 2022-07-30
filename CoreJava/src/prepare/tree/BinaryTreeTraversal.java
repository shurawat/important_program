package prepare.tree;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinaryTreeTraversal {

	public static void main(String[] args) {

		CreateTree ctree = new CreateTree();
		Node root = ctree.createTree();

		TreeTraversal tree = new TreeTraversal();
		tree.preOrder(root);
		System.out.println();
		tree.inOrder(root);
		System.out.println();
		tree.postOrder(root);

	}

}

class CreateTree {

	public Node createTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		return root;
	}

}

class TreeTraversal {

	// left --> root --> right

	public void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	// root --> left --> right

	public void preOrder(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	// left --> right --> root

	public void postOrder(Node root) {

		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}
}
