import java.util.Scanner;

public class addtwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divident = 10;
		int divisor =2;
		
		int remnder = (divident%divisor);
		int quotent = (divident/divisor);
		System.out.println("quotent"+quotent);
		System.out.println("remnder"+remnder);
		
		String s = "madam";
		String t ="";
		for (int i =s.length()-1;i>=0;i--) 
		{
			t =t + s.charAt(i);
		
		}
		System.out.println(t);
		System.out.println(s.length());
		if (s.equalsIgnoreCase(t)) 
		{
			System.out.println("palindrome");
		}
		
		
		
		int a=1;
		int b = 5;
//		int c= (a+b);
//		System.out.println(c);
		
		 a =(a-b);
		 b = (a+b);
		 a = (b-a);
		 
		 
		 System.out.println("****************");
		 
		 int k=1;
		 for (int i=0;i<=5;i++) {
			 
			 
			 for (int j=1; j<=5-i;j++)
			 {
				 System.out.print(k);
				 k++;
				 System.out.print("\t");
			 }
			 System.out.println("");
		 }
		 
		 
		 System.out.println("**********");
		 
		int  k1=3;
		 for (int i=1; i<4;i++)
		 {
			 for (int j=1;j<=0+i;j++) 
			 {
				 System.out.print(k1);
				 System.out.print("\t");
				 k1=k1+3;
				 
			 }
			 System.out.println("");
			 
			 
		 }
		 
		 
		 
		System.out.println("-----------------------------------------------------------"); 
		
		
		int fe = 10;
		int se = 5;
		
		fe=(fe-se);//10-5=5
		se=(fe+se);//5+5=10
        fe=(se-fe);//10-5=5
		
		System.out.println(fe);
		System.out.println(se);
		System.out.println("-----------------------------------------------------");
		
		String temp ="";
		String sr= "jagti";
		for ( int i=sr.length()-1;i>=0;i--){
		temp=temp+	sr.charAt(i);
			
		 }
		 System.out.println(temp);
		 System.out.println("----------------------------------------------------------");
		 int temp1=1;
		 for (int i=0; i<4;i++) {
			 
			 for (int j=1;j<=0+i;j--) {
				 
				 System.out.print(temp1);
				 temp1++;
			 }
			 
			 
		 }
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		
		
	
	
	
	

}
