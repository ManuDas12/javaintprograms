package javaPrograms;
import java.util.Scanner;
public class multi_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the num");
		int num=input.nextInt();
		for(int i=1;i<=10;i++) {
			int s=num*i;
			System.out.println(num+ " x " +i+"== "+s);
		}
	}

}
