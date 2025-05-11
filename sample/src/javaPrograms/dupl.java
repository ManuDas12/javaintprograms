package javaPrograms;

import java.util.HashSet;

public class dupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {1,2,3,3,4,5,555,6,6,7,7,8};
		HashSet<Integer> value=new HashSet<>();
		for(int i=0;i<ar1.length;i++) {
			if(!value.add(ar1[i])) {
				System.out.println(ar1[i]);
				
			}
		}
	}

}
