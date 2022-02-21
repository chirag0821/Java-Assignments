//Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

public class Question2 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		String str = "That that is is that that is not is not Is that it It is";
		str = str.toLowerCase();
		String[] strgs = str.split(" ");
		
		for (String word: strgs) {
			Integer cnt = map.get(word);
		    if(map.get(word) == null) {
		    	map.put(word, 1);
		    }else {
		    	map.put(word, cnt+1);
		    }
		}
		System.out.println(map);
	}
}
