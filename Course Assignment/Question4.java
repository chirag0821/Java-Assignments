//Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;

public class Question4 {

	public static void main(String[] args) {
		HashMap<Character,Integer>map = new HashMap<>();
		String str = "This is sample text m s";
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			Integer count = map.get(ch[i]);
			if(count == null) {
				map.put(ch[i], 1);
			}
			else if(count == 1 && ch[i] != ' '){
				System.out.print(ch[i]+" ");
				map.put(ch[i],count+1);
			}
			else {
				map.put(ch[i],count+1);
			}
		}
	}

}
