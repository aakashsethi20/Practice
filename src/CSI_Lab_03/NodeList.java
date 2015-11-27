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
import java.util.LinkedList;

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
		else if(linkedList.peekFirst() == element)
			return true;
		return false;
	}

	// fixed me!
	public boolean isLast(E element) {
		if(element == null)
			return false;
		else if(linkedList.peekLast() == element)
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

	// fix me!
	E prev(E element)
			throws NoSuchElementException {
		throw new NoSuchElementException();
		// return null;
	}


	// fix me!
	E next(E element)
			throws NoSuchElementException {
		int index = linkedList.indexOf(element) + 1;
		if(linkedList.get(index) == null)
			throw new NoSuchElementException();
		return linkedList.get(index);
	}

	// fix me!
	public void swapElements(E element1, E element2)
			throws NoSuchElementException {
		throw new NoSuchElementException();
	}


	// fix me!
	public void set(E currElement, E repElement)
			throws NoSuchElementException {
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

	// fix me!
	public void addBefore(E currElement,E addElement)
			throws NoSuchElementException {
		throw new NoSuchElementException();
	}

	// fix me!
	public void addAfter(E currElement,E addElement) 
			throws NoSuchElementException {
		throw new NoSuchElementException();
	}

	// fix me!
	public E remove(E element) 
			throws NoSuchElementException {
		throw new NoSuchElementException();
	}
}
