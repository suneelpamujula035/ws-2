package java_programs_06;

public class Pattern_2 {

	public static void main(String[] args) {

		int i, j;
//		for(i=1; i<=5; i++)
//		{
//			for(j=5; j>=i; j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(i=5; i>=1; i--)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
