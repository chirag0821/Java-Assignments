//Write a Java Program to find the second-highest number in an array.
public class Question5 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 55, 11, 23, 4};
		int n = arr.length;
		if(n < 2) {
			System.out.println("No 2nd largest element!!");
		}
		else {
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			for(int i=0;i<n;i++) {
	            if (arr[i] > first) {
	                second = first;
	                first = arr[i];
	            }
	            else if (arr[i] > second && arr[i] != first)
	                second = arr[i];
	        }
			if (second == Integer.MIN_VALUE)
	            System.out.print("No 2nd largest element!!\n");
	        else
	            System.out.print(second);
		}
	}

}
