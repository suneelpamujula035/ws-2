package java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(4,5,6,7,8);
//		for(int i=0; i<=values.size(); i++)
//		{
//			System.out.println(values.get(i));
//		}
		
//		for(Integer i : values)
//		{
//			System.out.println(i);
//		}
		
		values.forEach(x->System.out.println(x));
		
	
//		int a[] = {5,6,9,74,98};
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		int i=0;
//		while(i!=a.length) {
//			
//				list.add(a[i]);
//			i++;
//		}
//		list.forEach(g -> System.out.println(g));
	}

}
