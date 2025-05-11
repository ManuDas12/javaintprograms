package javaPrograms;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {1,2,3,4,5};
		int val=3;
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]==val) {
				System.out.println("element found "+val+" at "+i+" position");
				return;
			}
			}
		    System.out.println("element not found in any position");
			
		}
	}

