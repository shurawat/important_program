package tree;

import java.util.LinkedList;
import java.util.Queue;

public class ZigZag {

	public static void main(String[] args) {
		CreateTree ctree = new CreateTree();
		Node head = ctree.createTree();
		printZigZag(head);
	}

	private static void printZigZag(Node head) {

		Queue<Node> queue = new LinkedList<>();
		queue.add(head);
		boolean isLeft = false;

		while (!queue.isEmpty()) {
			Node top = queue.remove();
			System.out.print(top.value + " ");
			if (top.left != null) {
				queue.add(top.left);
			}
			if (top.right != null) {
				queue.add(top.right);
			}
		}

	}

}
