package prepare.linklist;

public class LinkListExample {

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		head.next.next.next.next.next.next.next.next = new Node(9);

		Node n = findMid(head);

		System.out.println("mid is " + n.key);

		removeElementFromEnd(3, head);

		while (head != null) {
			System.out.println(head.key);
			head = head.next;
		}

	}

	private static Node findMid(Node head) {
		Node p = head;
		Node q = head;

		while (p != null && p.next != null) {
			p = p.next.next;
			q = q.next;
		}
		return q;
	}

	public static void removeElementFromEnd(int n, Node head) {
		int i = 1;
		Node temp = head;
		Node temp1 = head;
		Node previous = temp1;
		while (i <= n) {

			temp = temp.next;
			i++;
		}
		while (temp != null) {

			temp = temp.next;
			previous = temp1;
			temp1 = temp1.next;

		}

		previous.next = temp1.next;

	}

}

class Node {

	public Node next;
	public int key;

	public Node(int key) {
		this.key = key;
	}

}