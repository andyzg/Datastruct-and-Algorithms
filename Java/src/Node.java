/**
 * Node class used for data structures
 * @author Andy
 *
 */
public class Node {

	int value;
	TreeNode treeNode; // for BFS purposes
	Node next;
	
	public Node(int value)
	{
		this.value = value;
	}
	
	public Node(TreeNode n)
	{
		this.treeNode = n;
	}
}
