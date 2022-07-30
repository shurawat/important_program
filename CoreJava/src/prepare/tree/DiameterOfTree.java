package prepare.tree;

public class DiameterOfTree {
	
	public static void main(String[] args) {
		CreateTree createTree = new CreateTree();
		Node root = createTree.createTree();
		int diameter = diameter(root);
		System.out.println(diameter);
		
	}
	
	public static int diameter(Node root) {
		if(root == null) {
			return 0;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		int ld = diameter(root.left);
		int rd = diameter(root.right);
		
		return Math.max(lh + rh + 1,
                Math.max(ld, rd));
		
	}
	
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(lh < rh) {
			return 1 + rh;
		} else {
			return 1 + lh;
		}
		
	}

}
