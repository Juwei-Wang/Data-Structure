import java.util.*;
import java.io.*;

//Submission for Juwei wang, 30053278

class SGrindelwald {


	public static void main(String[] args){
		//Assertion args is an array of strings
		if (args.length != 1){
			//Assertion length of the array passed is not 1
			System.out.println("Gadzooks! One integer input is required.");
		}else{
			//Assertion length of args is 1
			try{
				//Assertion first member of args might be an int
				int n = Integer.parseInt(args[0]);
				if (n < 0){
					//Assertion int is a negative integer
					System.out.println("Gadzooks! The integer input cannot be negative.");
				}else{
					//Assertion inp is a positive or 0 integer
					System.out.println(sGrin(n));
				}
			}catch(Exception e){
				System.out.println("Silly muggle! One integer input is required.");	
			}
		}
	}

	protected static int sGrin(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException();
		}else if (n == 0) {
			//Assertion n == 0
			//Assertion a non negative integer n has been passed to the method
				return 1;
			} else if (n == 1) {
			//Assertion n == 1
			//Assertion a non negative integer n has been passed to the method
				return 2;
			} else if (n == 2) {
			//Assertion n == 2
			//Assertion a non negative integer n has been passed to the method
				return 3;
			} else if (n == 3) {
			//Assertion n == 3
			//Assertion a non negative integer n has been passed to the method
				return 4;
			} else if ((n % 2) == 0) {
			//Assertion n >=4 and n is even
			//Assertion a non negative integer n has been passed to the method
				return 2 * sGrin(n - 1) - 2 * sGrin(n - 3) + sGrin(n - 4);
			} else {
			//Assertion n >=4 and n is odd
			//Assertion a non negative integer n has been passed to the method
				return sGrin(n - 1) + 3 * sGrin(n - 2) - 5 * sGrin(n - 3) + 2 * sGrin(n - 4);
			}

		//Assertion a non negative integer n has been provided to the method as input
		//Assertion nth Hufflepuff number has been returned as output
		}
}
