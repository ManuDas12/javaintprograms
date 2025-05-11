package javaPrograms;

public class Lefttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
