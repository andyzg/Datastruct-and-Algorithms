package LinkedListProblems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list 
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed? 
 * @author Andy
 *
 */
public class P2_1 {

	/**
	 * Store all of the numbers in a set. Since all elements in a set must be unique, then
	 * it will know if it already exists
	 * @param list
	 */
	private static void removeDuplicate(LinkedList<Integer> list)
	{
		Set<Integer> set = new HashSet<Integer>();
		
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			int element = iterator.next();
			if (set.contains(element)) {
				iterator.remove();
			}
			else {
				set.add(element);
			}
		}
		return;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(9);
		
		removeDuplicate(list);
		
		for ( int i=0 ; i<list.size() ; i++ ) {
			System.out.println(list.get(i));
		}
	}
}
