package javaPrograms;
//program to display all even numbers
import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		//System.out.print("enter num");
		//int num=input.nextInt();
		System.out.print("enter limit");
		int l=input.nextInt();
		for(int i=0;i<l;i++) {
		if(i%2==0) {
			System.out.println(i+ " even number");
		}
		}
		
	}

}
