package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collect2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<String> str =new HashSet<String>();
    str.add("manu");
    str.add("das");
    str.add("m");
    
    Set<String> str1 =new HashSet<String>();
    str1.add("hi");
    str1.add("hello");
    str1.add("manu");
    
    //add all method
    
    str.addAll(str1);
    System.out.println(str);
    ///iterator
    Iterator<String> itr =str.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
	}

}
