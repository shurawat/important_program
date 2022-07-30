package prepare.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelTraversal {

	public static void main(String[] args) {

		CreateTree ctree = new CreateTree();
		Node root = ctree.createTree();

		/*
		 * 
		 * 
		 * 1 2 3 4 5
		 * 
		 * 
		 * 3------
		 * 
		 * 
		 */

		Queue<Node> queue = new ArrayDeque<>();
		queue.add(root);
		

		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}

		}

	}

}
