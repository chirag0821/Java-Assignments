//Write a Java Program to iterate Hash-Map using While and advance for loop.

import java.util.HashMap;
import java.util.Iterator;

public class Question1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Mumbai");
		map.put(2, "Pune");
		map.put(3, "Delhi");
		map.put(4, "Lukhnow");
		
		//iteration using while loop
		Iterator <Integer> itr = map.keySet().iterator();        
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println("Key = " + key + ", Value = "+ map.get(key));

        }   
        
        System.out.println();
        
		//iteration using advance for loop
		map.forEach((key,value)->{
			System.out.println(key +"->"+value);
		});
	}
}
