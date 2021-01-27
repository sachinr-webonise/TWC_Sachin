package Basic_java_practice;

import java.util.Scanner;

import org.seleniumhq.jetty9.util.Scanner.ScanListener;

public class checknumisoddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner (System.in);
		System.out.println("enter a num");
		
		int number= reader.nextInt();
		
		if (number%2==0)
		{
			System.out.println("number is even");
			
		}
		
		else
		{
			System.out.println("number is odd");
		}
		
		
		
	}

}
