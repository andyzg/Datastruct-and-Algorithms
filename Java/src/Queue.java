
public class Queue {

	Node first, last;
	
	void enqueue(Node n)
	{
		if (n == null)
			return;
		if (first == null)
		{
			first = n;
			last = n;
		}
		else
		{
			last.next = n;
			last = n;
		}
	}
	
	Node dequeue()
	{
		if (first != null)
		{
			Node temp = first;
			first = first.next;
			return temp;
		}
		else
			return null;
	}
	
	private void printQueue()
	{
		if (first != null)
		{
			Node n = first;
			while (n != null)
			{
				System.out.print(n.value + "\t");
				n = n.next;
			}
			System.out.println();
		}
		return;
	}
	
	
	public static void main(String[] args)
	{
		Queue queue = new Queue();
		
		queue.enqueue(new Node(1));
		queue.enqueue(new Node(4));
		queue.enqueue(new Node(7));
		queue.enqueue(new Node(8));
		queue.enqueue(new Node(5));
		
		queue.printQueue();
		
		queue.dequeue();
		queue.dequeue();
		
		queue.printQueue();
		
		queue.enqueue(new Node(4));
		queue.enqueue(new Node(10));
		
		queue.printQueue();
	}
}