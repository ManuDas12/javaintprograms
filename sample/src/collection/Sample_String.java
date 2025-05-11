package collection;

public class Sample_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_String obj=new Sample_String();
		String name="hello manu";
		
		name=name.trim();//remove spaces
		
		if(!name.isEmpty()) {
			name=name.substring(0,1).toUpperCase() + name.substring(1,10);//extract + uppercase +rejoin
		}
		System.out.println(name);
		obj.cap();
	}
	
	public void cap() {
		String word="had has and";
		String sentence[]=word.split(" ");
		
		StringBuilder result=new StringBuilder();
		for(String words:sentence) {
			result.append(words.substring(0,1).toUpperCase()+words.substring(1)+" ");
		}
		System.out.print(result.toString().trim());
			
		}
}				
