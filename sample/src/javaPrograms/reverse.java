package javaPrograms;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="manu";
		String reverse="";
		for(int i=0;i<n.length();i++) {
			reverse=n.charAt(i)+reverse;
		}
		System.out.print(reverse);
	}

}
