package javaPrograms;

public class arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n =153;
        int rem,result = 0;
        int original=n;
        
        while(original!=0) {
        	rem=original%10;
        	result+=Math.pow(rem,3);
        	original/=10;
        }
        if(result==n) {
        	System.out.println("amstrong "+n);
        }
        else {
        	System.out.println("not amstrong "+n);
        }
        }
	}


