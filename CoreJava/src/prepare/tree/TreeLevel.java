package prepare.tree;

public class TreeLevel {

	public static void main(String[] args) {

		CreateTree ctree = new CreateTree();
		Node root = ctree.createTree();
		int level = treeLevel(root);
		System.out.println(level);
		int keyLevel = levelOfNode(root, 6, 0);
		System.out.println(keyLevel);

	}

	public static int treeLevel(Node root) {
		if (root == null) {
			return -1;
		} else {
			int ll = treeLevel(root.left);
			int rl = treeLevel(root.right);
			if (ll > rl) {
				return ll + 1;
			} else {
				return rl + 1;
			}
		}

	}

	public static int levelOfNode(Node root, int key, int level) {
		if (root == null) {
			return 0;
		}

		if (root.data == key) {
			return level;
		}
		int result = levelOfNode(root.left, key, level + 1);
		if (result != 0) {
			return result;
		}
		result = levelOfNode(root.right, key, level + 1);
		return result;

	}

}
