package collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Collect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> refvar = new ArrayList<String>();
		refvar.add("manu");
		refvar.add("das");
		refvar.add("M");
		System.out.println(refvar);
		
		
		refvar.add(1, "HI");
		System.out.println(refvar);
		
		refvar.set(1,"hello");
		System.out.println(refvar);
		
		//get method,used for get a specific element from index value
		
		System.out.println(refvar.get(2));
		
		//search
		System.out.println(refvar.contains("das"));
		//using if
		if(refvar.contains("das")) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		//remove
		/*	System.out.println(refvar.remove(1));
		
		System.out.println(refvar);
		
		//empty list(to remove all elements from list)
		refvar.removeAll(refvar);
		System.out.println(refvar);
		
		//is empty
		if(refvar.isEmpty())
		{
			System.out.println("empty");
		}
		else {
		System.out.println("not empty");
		}*/
		
		//iterator(an interface for traversing element )
		Iterator<String> iteratorvar = refvar.iterator();
		while(iteratorvar.hasNext()) {//check if value present
			System.out.println(iteratorvar.next());
		}
		iteratorvar.remove();//to remove last element
		System.out.println(refvar);
	}

}
