
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
	
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		
		bt.addNode(new TreeNode(5));
		bt.addNode(new TreeNode(2));
		bt.addNode(new TreeNode(3));
		bt.addNode(new TreeNode(8));
		bt.addNode(new TreeNode(10));
		
		bt.traverse(bt.root);
		bt.findNumber(10, bt.root);
	}
}