
public class BinaryTree {

	TreeNode root;
	
	public BinaryTree()
	{
		// Empty Binary Tree
	}
	
	public BinaryTree(TreeNode n)
	{
		root = n;
	}
	
	public void addNode(TreeNode n)
	{
		if (root == null)
		{
			root = n;
		}
		else
		{
			addNode(n, root);
		}
	}
	
	public void addNode(TreeNode n, TreeNode parent)
	{
		if (root == null)
			root = n;
		else
		{
			if (n.value < parent.value)
			{
				if (parent.left == null)
					parent.left = n;
				else
					addNode(n, parent.left);
			}
			else
			{
				if (parent.right == null)
					parent.right = n;
				else
					addNode(n, parent.right);
			}
		}
	}
	
	private void traverse(TreeNode n)
	{
		if (n == null)
			return;
		traverse(n.left);
		System.out.println(n.value);
		traverse(n.right);
	}
	
	private void findNumber(int value, TreeNode n)
	{
		if (n == null)
			System.out.println("Not found");
		else if (n.value == value)
			System.out.println("Found");
		else if (value < n.value)
		{
			System.out.println("Traversing left of " + n.value);
			findNumber(value, n.left);
		}
		else 
		{
			System.out.println("Traversing right of " + n.value);
			findNumber(value, n.right);
		}
	}
	
	private void addArray(int[] array)
	{
		for (int i=0; i<array.length; i++)
			this.addNode(new TreeNode(array[i]));
		return;
	}
	
	private void printTree()
	{
		if (this.root == null)
			return;
		Queue queue = new Queue();
		
		queue.enqueue(new Node(this.root));
		System.out.println(this.root.value);
		
		while (queue.first != null)
		{
			TreeNode n = queue.dequeue().treeNode;
			
			if (n.left != null)
			{
				queue.enqueue(new Node(n.left));
				System.out.print(n.left.value+"\t");
			}
			if (n.right != null)
			{
				queue.enqueue(new Node(n.right));
				System.out.print(n.right.value+"\t");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] values = {1,5,8,7,4,2,6,0,9,8,8,7,5,2};
		BinaryTree bt = new BinaryTree();
		
		bt.addArray(values);
		
		bt.traverse(bt.root);
		bt.findNumber(10, bt.root);
		
		System.out.println();
		
		bt.printTree();
	}	
}