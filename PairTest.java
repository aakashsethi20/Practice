package Practice;

/*
 * This is a class to test and practice generic casting.
 * 
 * @author Aakash Sethi
 * 2015-10-13
 */
public class PairTest {
	
	private static Pair<String, Integer> obj1;
	private static Pair<String, Integer> obj2;
	private static Pair<Character, Boolean> obj3;
	
	public static void main(String[] args) {
		
		obj1 = new Pair<>("Aakash Sethi", 19);
		obj2 = new Pair<>("Marko Sekulov", 18);
		obj3 = new Pair<>('X', true);
		
		printAll();
	}
	
	public static void printAll() {
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
