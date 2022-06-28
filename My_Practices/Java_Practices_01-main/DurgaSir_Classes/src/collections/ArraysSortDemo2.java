package collections;

import java.util.Arrays;
import java.util.Comparator;

class MyComp1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
	
}
public class ArraysSortDemo2 {

	public static void main(String[] args) {

		int a[] = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		String s[] = {"A","Z","B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "S"));
		System.out.println(Arrays.binarySearch(s, "S", new MyComp1()));
		System.out.println(Arrays.binarySearch(s, "5", new MyComp1()));
		
	}

}
