/*  CSI2114 Lab 2 - DLinkedList.java
 *  
 *  Class doubly linked list   
 *  
 *  by Jeff Souza
 *
 */

class DLinkedList {

	ListNode firstNode;
	ListNode lastNode;

	// Appends a node to the end of the list
	void AppendNode(ListNode nNode) {
		InsertNode(nNode,lastNode);
	}

	//********* Implemented this method **************//
	// Inserts a node into the list after pAfter
	void InsertNode(ListNode nNode, ListNode pAfter) {

		if(pAfter == null) {
			firstNode = nNode;
			return;
		}
		
		nNode.previous = pAfter;
		nNode.next = pAfter.next;
		nNode.next.previous = nNode;
		pAfter.next = nNode;
	}

	// Removes the specified node from the list
	void RemoveNode(ListNode nNode) {

		// INSERT YOUR CODE HERE

	}

	// print the content of the list
	void print() {
		ListNode nNode = null;
		System.out.print("Current list: ");
		for (nNode = firstNode; nNode != null; nNode = nNode.next) {
			System.out.print(nNode.data +  " ");
		}
		System.out.println("");
	} 

}