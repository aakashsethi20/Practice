package Practice;

/*
 * This is a generic class of Pair type. It is supposed to store
 * pair of objects.
 * 
 * @author Aakash Sethi 
 * On 2015-10-13
 */
public class Pair<K, V> {
	private K first;
	private V second;
	
	public Pair(K a, V b) {
		first = a;
		second = b;
	}
	
	public K getFirst() {
		return first;
	}
	
	public V getSecond() {
		return second;
	}
	
	public void setFirst(K a) {
		first = a;
	}
	
	public void setSecond(V b) {
		second = b;
	}
	public String toString() {
		return (first + "\t" + second);
	}
}
