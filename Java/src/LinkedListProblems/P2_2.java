package LinkedListProblems;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 * @author Andy
 *
 */
public class P2_2 {

	/**
	 * Using two pointers that are k distance away, we can shift both of them until 
	 * the one at the front hits the end. Then we can return the one at the
	 * back. Assumption that k is 0 indexed
	 * @param head
	 * @param k
	 */
	private static LinkedListNode findKth(LinkedListNode head, int k) {
		if (head == null) {
			return null;
		}
		
		LinkedListNode front = head;
		LinkedListNode back = head;
		
		for (int i=0; i<k; i++) {
			if (front.next != null) {
				front = front.next;
			}
			else {
				return null;
			}
		}
		
		while (front.next != null) {
			front = front.next;
			back = back.next;
		}
		
		return back;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(3);
		head.appendToTail(1);
		head.appendToTail(5);
		head.appendToTail(10);
		
		LinkedListNode kth = findKth(head, 4);
		
		if (kth != null) {
			System.out.println(kth.data);
		}
		else {
			System.out.println("Kth element does not exist");
		}
		
		return;
	}
}
