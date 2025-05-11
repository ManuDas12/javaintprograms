package javaPrograms;

import java.util.Arrays;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {5,10,15,20};
		int size=ar.length;
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					temp=ar[j];
				}
			}
		}
		System.out.println("second largest is "+ar[size-2]);		
	}
}
	
	/*public void lar() {
		  int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);
	   }
	}
	
*/
