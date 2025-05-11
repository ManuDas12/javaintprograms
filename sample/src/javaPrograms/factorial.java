package javaPrograms;
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int num=input.nextInt();
		input.close();
		
		for(int i=1;i<=num;i++) {
			fac*=i;
		}
		System.out.println(fac);
	}

}
