/**
 * Array Heap implementation of a priority queue
 * @author Lachlan Plant
 * @author (Implemented by) Aakash
 */
public class HeapPriorityQueue<K extends Comparable,V> implements PriorityQueue<K ,V> {
    
    private Entry[] storage; //The Heap itself in array form
    private int tail;        //Index of last element in the heap
    
    /**
    * Default constructor
    */
    public HeapPriorityQueue(){
    	this(0);
    }
    
    /**
    * HeapPriorityQueue constructor with max storage of size elements
    */
    public HeapPriorityQueue(int size){
    	
    	storage = new Entry[size];
    	tail = -1;
    	
    }
    
    /****************************************************
     * 
     *             Priority Queue Methods
     * 
     ****************************************************/
    
    /**
    * Returns the number of items in the priority queue.
    * O(1)
    * @return number of items
    */
    public int size(){
        return tail+1;
    }

    /**
    * Tests whether the priority queue is empty.
    * O(1)
    * @return true if the priority queue is empty, false otherwise
    */
    public boolean isEmpty(){
        if(tail < 0)
        	return true;
        return false;
    }
    
    /**
    * Inserts a key-value pair and returns the entry created.
    * O(log(n))
    * @param key     the key of the new entry
    * @param value   the associated value of the new entry
    * @return the entry storing the new key-value pair
    * @throws IllegalArgumentException if the heap is full
    */
    public Entry<K,V> insert(K key, V value) throws IllegalArgumentException{
    	if(tail == storage.length-1)
    		throw new IllegalArgumentException();
    	tail += 1;
    	storage[tail] = new Entry<K,V>(key, value);
    	upHeap(tail);
    	return new Entry<K,V>(key, value);
    }
    
    /**
    * Returns (but does not remove) an entry with minimal key.
    * O(1)
    * @return entry having a minimal key (or null if empty)
    */
    public Entry<K,V> min(){
    	if(isEmpty()) {
        	return null;
        }
    	return storage[0];
    } 
    
    /**
    * Removes and returns an entry with minimal key.
    * O(log(n))
    * @return the removed entry (or null if empty)
    */ 
    public Entry<K,V> removeMin(){
    	
    	if(isEmpty())
    		return null;
    	Entry<K,V> temp = storage[0];
    	if(tail != 0) {
    		storage[0] = storage[tail];
    		storage[tail] = null;
    		tail--;
    		downHeap(0);
    		return temp;
    	}
    	else {
    		tail = -1;
    		storage[0] = null;
    		return temp;
    	}
    }  
    
    
    /****************************************************
     * 
     *           Methods for Heap Operations
     * 
     ****************************************************/
    
    /**
    * Algorithm to place element after insertion at the tail.
    * O(log(n))
    */
    private void upHeap(int location){
    	
    	if(location == 0)
    		return;
    	if(compare(location, parent(location)) < 0) {
    		swap(location, parent(location));
    		upHeap(parent(location));
    	}
    	          
    }
    
    /**
    * Algorithm to place element after removal of root and tail element placed at root.
    * O(log(n))
    */
    private void downHeap(int location){
         return;            
    }
    
    /**
    * Find parent of a given location,
    * Parent of the root is the root
    * O(1)
    */
    private int parent(int location){
        return (location - 1)/2;
    }
    
   
    /**
    * Inplace swap of 2 elements, assumes locations are in array
    * O(1)
    */
    private void swap(int location1, int location2){
    	Entry<K,V> temp = storage[location2];
    	storage[location2] = storage[location1];
    	storage[location1] = temp;  
    }
    
    /**
     * Method to compare the keys of two entries
     */
    private int compare(int location1, int location2) {
    	return storage[location1].getKey().compareTo(storage[location2].getKey());
    }
    
}
