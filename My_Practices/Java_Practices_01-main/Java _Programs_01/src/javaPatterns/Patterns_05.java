package javaPatterns;

public class Patterns_05 {

	public static void main(String[] args) {

		int n=5, num=1,i,j;
		for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		}
	}

}
