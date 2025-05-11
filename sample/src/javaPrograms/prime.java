package javaPrograms;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int d=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				d++;
			}
		if(d==2) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println("not prime");
		}
		}
	}

