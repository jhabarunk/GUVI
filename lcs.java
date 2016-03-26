class Node {

	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class BinaryTree {

	static Node root;
	Node lca(Node node, int n1, int n2) {
		if (node == null) {
			return null;
		}
		if (node.data > n1 && node.data > n2) {
			return lca(node.left, n1, n2);
		}
		if (node.data < n1 && node.data < n2) {
			return lca(node.right, n1, n2);
		}

		return node;
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(9);
		tree.root.left = new Node(2);
		tree.root.right = new Node(20);
		tree.root.left.left = new Node(1);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(25);
		tree.root.right.left.right = new Node(15);

		int n1 = 12, n2 = 25;
		Node t = tree.lca(root, n1, n2);
		System.out.println(t.data);
	}
}
