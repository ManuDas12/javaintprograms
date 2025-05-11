package javaPrograms;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starmake(6);
	}
	public static void starmake(int n){
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
		System.out.println();
		}

}
}
