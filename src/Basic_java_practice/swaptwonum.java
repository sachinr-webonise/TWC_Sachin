package Basic_java_practice;

public class swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=20;
		int b=10;
		System.out.println("before swap-----" +a);
		System.out.println("before swap-----" +b);

//		int temp;
//		temp =a;
//		a=b;
//		b= temp;
//		
//		System.out.println("after swap-----" +a);
//		System.out.println("after swap-----" +b);
		
		System.out.println("afterswap");
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);


		
		
		
		
		
		
	}

}
