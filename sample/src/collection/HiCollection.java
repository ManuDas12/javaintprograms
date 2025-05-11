package collection;

import java.util.LinkedList;

public interface HiCollection {
	public static void main(String args[]) {
		LinkedList<String> m=new LinkedList<String>();
		{
			m.add("hi");
			m.add(2, "hello");
		}
	System.out.println(m);
}
}