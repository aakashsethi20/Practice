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
    	if(!(key instanceof Comparable)) {
    		throw new IllegalArgumentException();
    	}
    	tail += 1;
    	try {
    		storage[tail].key = key;
        	storage[tail].value = value;
    	}
    	catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("The Priority Queue is full");
    		return new Entry<K, V>(key, value);
    	}
    	int index = tail;
    	
    	for(int count=0; count < tail/2; count ++) {
    		if(storage[index].getKey().compareTo(storage[index/2].getKey()) < 0) {
        		K tempk;
        		tempk = (K) storage[index].getKey();
        		storage[index].key = storage[index/2].getKey();
        		storage[index/2].key = tempk;
        		
        		V tempv;
        		tempv = (V) storage[index].getValue();
        		storage[index].value = storage[index/2].getValue();
        		storage[index/2].value = tempk;
        		index = index/2;        		
        	}
    		else {
    			break;
    		}
    	}    	
		return new Entry<K,V>(key, value);
    }
    
    /**
    * Returns (but does not remove) an entry with minimal key.
    * O(1)
    * @return entry having a minimal key (or null if empty)
    */
    public Entry<K,V> min(){
    	if(storage[0] == null) {
        	return storage[0];
        }
    	return null;
    } 
    
    /**
    * Removes and returns an entry with minimal key.
    * O(log(n))
    * @return the removed entry (or null if empty)
    */ 
    public Entry<K,V> removeMin(){
        return null;
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
         return;          
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
        return -1;
    }
    
   
    /**
    * Inplace swap of 2 elements, assumes locations are in array
    * O(1)
    */
    private void swap(int location1, int location2){
        return;  
    }
    
}
