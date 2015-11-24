package CSI_Lab_01;

/**
 * This class is implemented for Doubly Linked Lists.
 * Each node has a value, a next and a previous.
 *  
 * @author Aakash
 *
 */

public class DNode {
	
	private Object element;
	private DNode next, prev;
	
	DNode() { 
		this(null, null, null); 
	}
	
	DNode(Object e, DNode p, DNode n) {
		element = e;
		next = n;
		prev = p;
	}
	
	public void setElement(Object newElem) { element = newElem; }
	public void setNext(DNode newNext) { next = newNext; }
	//Method added to set previous node
	public void setPrev(DNode newPrev) { prev = newPrev; }
	public Object getElement() { return element; }
	public DNode getNext() { return next; }
	//Method added to get previous node
	public DNode getPrev() { return prev; }
}
