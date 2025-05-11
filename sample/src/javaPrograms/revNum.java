package javaPrograms;
import java.util.Scanner;

public class revNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num,val,newval=0;
		System.out.println("enter the num");
		num=input.nextInt();
		
		while(num!=0) {
			val=num%10;
			newval=newval*10+val;
			num=num/10;
		}
		System.out.println(newval);
	}

}
