package javaPrograms;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter the word ");
		 char ch=input.next().charAt(0);
		 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			 System.out.print("vowel");
		 }
		 
	}
}
