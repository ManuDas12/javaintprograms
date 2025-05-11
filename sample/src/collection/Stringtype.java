package collection;

public class Stringtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer nam= new StringBuffer("hello");
		
		nam.append(" world");
		nam.insert(6, "manu ");
		nam.replace(11, 16, "india");
		nam.delete(11, 16);
		nam.reverse();
		
		
		
		System.out.println(nam);

	}

}
