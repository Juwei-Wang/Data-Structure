import java.util.*;
import java.io.*;

//Submission for Juwei wang, 30053278

public class FGrindelwald {
	public static void main(String[] args){
        //Assertion an array of strings is passed
		if (args.length != 1){
            //Assertion an array of strings passed of length not equal to 1
			System.out.println("Gadzooks! One integer input is required.");
		}else{
            //Assertion length of the array passed is 1
			try{
                //Assertion first member of array might be an integer
				int n = Integer.parseInt(args[0]);
				if (n < 0){
                    //Assertion first member of array converted is an integer
                    //Assertion inp is a negative integer
					System.out.println("Gadzooks! The integer input cannot be negative.");
				}else{
                    //Assertion first member of array converted is an integer
                    //Assertion inp is a positive or 0 integer
					System.out.println(fGrin(n));
				}
			}catch(Exception e){
				System.out.println("Silly muggle! One integer input is required.");
			}
		}
	}

	public static int fGrin(int n) throws IllegalArgumentException{
		if (n < 0){
			throw new IllegalArgumentException();
		}
		else if(n == 0){
            //Assertion a non negative integer n has been passed to the method
            //Assertion n == 0
			return 1;
		}else if(n == 1){
            //Assertion a non negative integer n has been passed to the method
            //Assertion n == 1
			return 2;
		}else if(n == 2){
            //Assertion a non negative integer n has been passed to the method
            //Assertion n == 2
			return 3;
		}else if(n == 3){
            //Assertion a non negative integer n has been passed to the method
            //Assertion n == 3
			return 4;
		}else {
            //Assertion a non negative integer n has been passed to the method
            //Assertion n >= 4
			int[] G = new int[n+1];
			G[0]=1;
			G[1]=2;
			G[2]=3;
			G[3]=4;
			int i = 4;
			while (i <= n) {
			    /*
			    Loop Invariant Assertions:
			    n is a non negative integer >= 4
			    i is an integer such that 4 <= i < = n+1
			    G[0] is an integer such that kadabra = Hi for i >= 3
			    G[1] is an integer such that abra = Hi-1 for i >= 3
			    G[2] is an integer such that pocus= Hi-2 for i >= 3
			    G[3] is an integer such that hocus= Hi-3 for i >= 3
			     */
				if ((i % 2 ) == 0) {
					G[i] = 2*G[i-1]-2*G[i-3]+G[i-4];
				}else{
					G[i] = G[i-1]+3*G[i-2]-5*G[i-3]+2*G[i-4];
				}
				i++;
			}
            //Assertion a non negative integer n has been provided to the method as input
            //Assertion nth Grindelwald number has been returned as output
            return G[n];
		}

	}
}