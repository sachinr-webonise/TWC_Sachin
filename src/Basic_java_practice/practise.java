package Basic_java_practice;

import java.util.ArrayList;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//swap two number without temp
		
		int a1 =20;
		int b1 =10;
		
		a1= (a1-b1);//20-10=10
		b1=(a1+b1);//10+10=20;
		a1=(b1-a1);//20-10=10
		
		System.out.println(a1);
		System.out.println(b1);
		
		System.out.println("---------------------------------------------------------");
		
//		swap two numbers with using 3 rd var
		
		int a2=100;
		int b2=50;
		int c=a2;
		a2=b2;
		b2=c;
		System.out.println(a2);
		System.out.println(b2);
		
		System.out.println("------------------------------------------------------------");
		
		
//		revrese string
		
		String s ="MADAM";
		String temp ="";
		for (int i=s.length()-1;i>=0;i--)
		{
			
		temp=temp+	s.charAt(i);
			
		}
		System.out.println(temp);
		
		if (temp.equalsIgnoreCase(s))
		{
			System.out.println("string is palindrome");
		}
		
		else 
		{
			System.out.println("not a palindrome");
		}
		
		
/*		print like
 * 1  2  3  4 
 * 5  6  7 
 * 8  9
 * 10
 */
		
		int t=1;
		for (int tri=1; tri<=5;tri++)
		{
			
			for ( int jre=0;jre<=4-tri;jre++)
			{
				System.out.print(t);
				t++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		
		int array[][]=new int[2][3];
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		array[1][0]=4;
		array[1][1]=5;
		array[1][2]=6;
		
		
		for ( int i=0; i<2;i++) {


			for (int j=0;j<3;j++) {
			System.out.println(array[i][j]);	
			}
		}

		
		System.out.println("----------------------------------------------------------");
		
		/*2 3 4
		 * 4 5 6
		 * 6 3 1
		 
		 */
		int minnumber [][]= {{2,3,4},{4,5,6},{6,3,1}};
		
		int min=minnumber[0][0];
		for (int i=0;i<3;i++) {
			
			for (int j=0;j<3;j++) {
				
				if (minnumber[i][j]<min) {
					min=minnumber[i][j];
				}
			}
		
		}
		
		System.out.println(min);
		
		
		
		
		
		
		
		
		
	}

}
