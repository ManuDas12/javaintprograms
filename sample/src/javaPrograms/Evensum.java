package javaPrograms;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {1,1,2,2,3,4,5,6,7,7,8,8,8,8};
		int evensum = 0;
		int oddsum=0;
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]%2==0) {
				evensum++;
			}
			else {
				oddsum++;
			}
		}
		System.out.println("even"+evensum);
		System.out.println("odd"+oddsum);
		
	}
}
		


