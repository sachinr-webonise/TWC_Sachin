package Basic_java_practice;

public class primeNumber {
	
	
	public static boolean isprimenumbr(int num) {
		 if (num<=1) {
		 return false;
		 }
		
		 for (int i=2;i<num;i++) {
			 if (num % i==0) {
				 return false;
			 }
		 }
		 return true;
		
		
	}
	
	public static void getPrimenumber(int num) {
		for (int i=2; i<=num; i++) {
			if (isprimenumbr(i))
				System.out.println(i);
				
		}
	}
	

	public static void main(String[] args) {
		System.out.println(isprimenumbr(10));
		getPrimenumber(20);
	}

}
