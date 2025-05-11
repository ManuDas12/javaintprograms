package javaPrograms;

public class pal_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 123;
		int original=num;
		int reverse=0;
	
		while(num!=0) {
		  int sum=num%10;
			reverse=reverse*10+sum;
			num/=10;
					
		}
		if(original==reverse) {
			System.out.println( " is palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}
	}

}
