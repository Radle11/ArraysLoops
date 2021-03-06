package Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		Cat russianBlue=new Cat("Kitty","RussianBlue",3);
		Cat scottish=new Cat("Lucy","Scottish",6);
		Cat persian=new Cat("Bella","Persion",7);
		
		TreeMap number=new TreeMap();
		number.put("David",20);
		number.put("Mykola",35);
		number.put("Lisa",33);
		System.out.println(number.values());
		
		
		TreeMap<String, Cat>cats=new TreeMap();
		cats.put("Russian", russianBlue);
		cats.put("Scotis", scottish);
		cats.put("Persian", persian);
		
		
		Set<String>catkey=cats.descendingKeySet();
		for(String str: catkey) {
			if(cats.get(str).getName().startsWith("L"))
			System.out.println(cats.get(str).getName());
		}
		
	
		}
}
