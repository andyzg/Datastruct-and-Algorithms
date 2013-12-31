
public class LinkedList {

	Node first;
	
	public LinkedList()
	{
		// Empty constructor
	}
	
	private void insertNode(int a)
	{
		Node n = new Node(a);
		n.next = first;
		first = n;
	}
	
	private Node deleteFirst()
	{
		Node n = first;
		first = first.next;
		return n;
	}
	
	private void printList()
	{
		Node n = first;
		while (n != null)
		{
			System.out.print(n.value+"\t");
			n = n.next;
		}
		System.out.println();
		return;
	}
	
	private void printIndex(int index)
	{
		Node n = first;
		for (int i=0; i<index; i++)
		{
			if (n.next != null)
			{
				n = n.next;
			}
			else
			{
				System.out.println("Doesn't Exist");
				return;
			}
		}
		System.out.println(n.value);
		return;
	}
	
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.insertNode(5);
		list.insertNode(1);
		list.insertNode(3);
		list.insertNode(3);
		list.insertNode(500);
		
		list.printList();
		list.printIndex(4);
	}
}
