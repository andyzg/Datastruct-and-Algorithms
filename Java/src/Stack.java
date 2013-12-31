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
	
	private void printStack()
	{
		if (top != null)
		{
			Node n = top;
			while (n != null)
			{
				System.out.print(n.value + "\t");
				n = n.next;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(new Node(1));
		stack.push(new Node(4));
		stack.push(new Node(3));
		stack.push(new Node(8));
		stack.push(new Node(7));
		
		stack.printStack();
		
		stack.pop();
		stack.pop();
		
		stack.printStack();
	}
}