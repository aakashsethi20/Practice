package CSI_Lab_01;

/** 
 * Builds a doubly linked list of size 5 and prints it to the console.
 * 
 * @author Jochen Lang
 */

class DList {
	DNode head, tail;

	DList( int sz ) {
		if ( sz <= 0 ) {
			head = null;
			tail = null;
		}
		else {
			// start with list of size 1
			head = new DNode( null, null, null );
			tail = new DNode(null, head, null);
			head.setNext(tail);
			
			// add further nodes
			for ( int i=0; i<sz; i++ ) {
				// create node and attach it to the list
				DNode node2Add = new DNode( Integer.toString(i), null, null );
				node2Add.setPrev(tail.getPrev());
				tail.getPrev().setNext(node2Add);
				tail.setPrev(node2Add);
				node2Add.setNext(tail);
			}
		}
	}

	/**
	 * Print all the elements of the list assuming that they are Strings
	 */
	public void print() {
		/* Print the list */
		DNode current = head.getNext(); // point to the first node
		while (current != tail) {
			System.out.print((String)current.getElement() + " ");	
			current = current.getNext(); // move to the next
		}
		System.out.println();	
	}

	public void deleteFirst() {
		if ( head.getNext() != tail ) {
			DNode toDel = head.getNext();
			toDel.getNext().setPrev(head);
			head.setNext(toDel.getNext());
		}
		else 
			System.out.println("The list doesn't have any elements that can be removed.");
	}

	public void deleteLast() {
		if ( head.getNext() == tail ) 
			return; // no node
		if(tail.getPrev() != head) {
			DNode toDel = tail.getPrev();
			toDel.getPrev().setNext(tail);
			tail.setPrev(toDel.getPrev());
		}
	}

	// create and display a linked list
	public static void main(String [] args){
		/* Create the list */
		DList dlist = new DList( 5 );
		/* Print the list */
		dlist.print();
		/* delete first and print */
		dlist.deleteFirst();
		dlist.print();
		/* delete last and print 5 times */
		for ( int i=0; i< 5; ++i ) {
			dlist.deleteLast();
			dlist.print();
		}
	}
}