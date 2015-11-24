
/*
 * This shows the Java implementation of insertion sort algorithm.
 * The example below does for int but this algorithm can be used for any 
 * comparable objects.
 * 
 * @author Aakash Sethi
 * On 2015-10-13
 */
public class InsertionSort {
	public int[] insertSort(int[] a) {
		for(int i=1; i < a.length; i++) {
			int cur = a[i];
			int j = i;
			while(j>0 && a[j-1] > cur) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = cur;
		}
		return a;
	}
}
