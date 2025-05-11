package sample;

public class Child extends Substract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.display();
		obj.substraction();
	}
	public void substraction() {
		int m=a-b;
		System.out.println(m);
	}

}
