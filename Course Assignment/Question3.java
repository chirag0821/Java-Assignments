//Write a Java Program to iterate Array List using for-loop,while-loop,and advance for-loop.
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		Integer n = 5;
		ArrayList<Integer> arrli= new ArrayList<Integer>(n);
		
	    for (int i = 1; i <= n; i++) {
	        arrli.add(i);
	    }
		//for loop
  		for(Integer it:arrli) {
  			System.out.print(it+" ");
  		}
  		
  		System.out.print("\n*********\n");
  		
  		//while loop
		Iterator<Integer> itr = arrli.iterator();
	     while(itr.hasNext()){
	    	 System.out.print(itr.next()+" ");
	    }
  		System.out.print("\n*********\n");
  		
  		//advance for loop
  		arrli.forEach((num)->{
            System.out.print(num+" ");
        });
		

	}
}
