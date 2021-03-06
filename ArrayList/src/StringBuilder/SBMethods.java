package StringBuilder;

public class SBMethods {
	public static void main(String[] args) {
		StringBuilder word1=new StringBuilder();
		word1.append("Java");
		word1.append(" Programming");
		System.out.println(word1);
		//Java - Programming
		//insert
		word1.insert(5,  "-");
		System.out.println(word1);
		word1.insert(6,  " ");
		System.out.println(word1);
		
		String word2=word1.toString();//StringBulder->String
		String word3="language";
		StringBuilder word4=new StringBuilder(word3);//String->StringBuilder
		System.out.println("--------------------");
		
		String word5="techtorial";
		//StringBuilder word6=new StringBuilder(word5);
		//System.out.println(word6.reverse().toString());
		System.out.println(new StringBuilder(word5).reverse().toString());//short way to convert and reverse
		
		//delete
		StringBuilder str1=new StringBuilder("Tea cup.");
		str1.delete(7, 8);
		System.out.println(str1);
		str1.delete(str1.indexOf("a"), str1.indexOf("a")+1);
		System.out.println(str1);
		
		System.out.println(str1.substring(str1.indexOf("c"),str1.indexOf("c")+1));
		
		
	}

}
