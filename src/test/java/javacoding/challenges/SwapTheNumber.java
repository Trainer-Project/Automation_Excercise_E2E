package javacoding.challenges;

public class SwapTheNumber {

	// How to swap the numbers without third variable
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		System.out.println("Before Swaping x value is :" + x);
		System.out.println("Before Swaping y value is :" + y);

		// 300 = 100 + 200;
		    y  =  x  +  y;
 
		// 200 = 300 - 100
		     x =  y  -  x;

		// 100 = 300 - 200
		    y  =  y  -  x;

		System.out.println("After Swaping x value is :" + x);
		System.out.println("After Swaping y value is :" + y);
	}
}
