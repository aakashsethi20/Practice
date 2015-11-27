// ==========================================================================
// $Id: addTemplate.cpp,v 1.1 2005/11/02 23:13:32 jlang Exp $
// CSI2110 Lab code Node List skeleton class
// ==========================================================================
// (C)opyright:
//
//   Jochen Lang
//   SITE, University of Ottawa
//   800 King Edward Ave.
//   Ottawa, On., K1N 6N5
//   Canada. 
//   http://www.site.uottawa.ca
// 
// Creator: jlang (Jochen Lang)
// Email:   jlang@site.uottawa.ca
// ==========================================================================
// $Log: addTemplate.cpp,v $
//
// ==========================================================================
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class NodeList<E> {
	// The linked list which is to be adapted
	protected LinkedList<E> linkedList = new LinkedList<E>();

	// Directly available
	public int size() {
		return linkedList.size();
	}

	// Directly available
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}

	// fixed me!
	public boolean isFirst(E element) {
		if(element == null)
			return false;
		else if(linkedList.peekFirst().equals(element))
			return true;
		return false;
	}

	// fixed me!
	public boolean isLast(E element) {
		if(element == null)
			return false;
		else if(linkedList.peekLast().equals(element))
			return true;
		return false;
	}

	// Directly available
	public E first() 
			throws NoSuchElementException {
		return linkedList.element();
	}


	// Directly available
	public E last() 
			throws NoSuchElementException {
		return linkedList.getLast();
	}

	// fixed me!
	E prev(E element)
			throws NoSuchElementException {
		if(linkedList.peekFirst().equals(element))
			return null;
		
		// Working with ListIterator
		ListIterator<E> bobby = linkedList.listIterator();
		
		while(bobby.hasNext()) {
			if(bobby.next().equals(element))
				bobby.previous();
				return bobby.previous();
		}
		throw new NoSuchElementException();
		// return null;
	}


	// fixed me!
	E next(E element)
			throws NoSuchElementException {
		if(linkedList.peekLast().equals(element))
			return null;
		
		ListIterator<E> bobby = linkedList.listIterator();
		while(bobby.hasNext()) {
			if(bobby.next().equals(element)) {
				return bobby.next();
			}
		}
		throw new NoSuchElementException();
		// return null;
	}

	// fixed me!
	public void swapElements(E element1, E element2)
			throws NoSuchElementException {
		int e1Index = linkedList.indexOf(element1);
		int e2Index = linkedList.indexOf(element2);
		if(e1Index != -1 && e2Index != -1) {
			linkedList.set(e2Index, element1);
			linkedList.set(e1Index, element2);
			return;
		}
		throw new NoSuchElementException();
	}


	// fixed me!
	public void set(E currElement, E repElement)
			throws NoSuchElementException {
		if(currElement != null) {
			int index = linkedList.indexOf(currElement);
			linkedList.set(index, repElement);
			return;
		}
		throw new NoSuchElementException();
	}


	// Directly available
	public void addFirst(E element) {
		linkedList.addFirst(element);
		return;
	}

	// Directly available
	public void addLast(E element) {
		linkedList.addLast(element);
		return;
	}

	// fixed me!
	public void addBefore(E currElement,E addElement)
			throws NoSuchElementException {
		if(linkedList.indexOf(currElement) != -1) {
			ListIterator<E> bobby = linkedList.listIterator();
			while(bobby.hasNext()) {
				if(bobby.next().equals(currElement)) {
					bobby.previous();
					bobby.add(addElement);
					return;
				}
			}
		}
		throw new NoSuchElementException();
	}

	// fixed me!
	public void addAfter(E currElement,E addElement) 
			throws NoSuchElementException {
		if(linkedList.indexOf(currElement) != -1) {
			ListIterator<E> bobby = linkedList.listIterator();
			while(bobby.hasNext()) {
				if(bobby.next().equals(currElement)) {
					bobby.add(addElement);
					return;
				}
			}
		}
		throw new NoSuchElementException();
	}

	// fixed me!
	public E remove(E element) 
			throws NoSuchElementException {
		if(linkedList.indexOf(element) != -1) {
			return linkedList.remove(linkedList.indexOf(element));
		}
		throw new NoSuchElementException();
	}
}
