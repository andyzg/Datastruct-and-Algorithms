/**
 * Implementation of a Stack
 * @author Andy
 *
 */
public class Stack {

	Node top;
	
	private void push(Node n)
	{
		if (n != null)
		{
			n.next = top;
			top = n;
		}
	}
	
	private Node pop()
	{
		if (top != null)
		{
			Node temp = top;
			top = temp.next;
			return temp;
		}
		else
			return null;
	}
	
	private Node peek()
	{
		if (top != null)
		{
			return top;
		}
		else
			return null;
	}
}
