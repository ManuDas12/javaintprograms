package javaPrograms;
import java.util.Scanner;
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int num=input.nextInt();		
		int a=0,b=1;
		for(int i=0;i<=num;i++){
			System.out.println(a);
			int val=a+b;
			a=b;
			b=val;
			
		}
	}

}
