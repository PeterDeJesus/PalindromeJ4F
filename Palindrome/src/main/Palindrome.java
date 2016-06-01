package main;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		String input;
		
		//Scanner object for input
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word or a number: ");
		input = in.nextLine();
		
		if(input.length()==0) {
			System.out.println("Empty Input!");
			System.exit(0);
		}
		
		char[] reverse = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			reverse[(input.length() - 1) - i] = input.charAt(i);
		}

		//Output the input in reverse
		System.out.print("Here is the reverse: ");
		for (int j = 0; j < input.length(); j++) {
			System.out.print(reverse[j]);
		}
		System.out.println();
		
		//Determine if input is palindrome
		int temp = 0;
		do {
			if(input.charAt(temp)!=reverse[temp]) {
				System.out.println("This is not a Palindrome");
				System.exit(0);
			}
			temp++;
		}while(temp!=input.length());
		
		//Output if input is palindrome
		System.out.println("This is a Palindrome");
		
		System.out.println();		//space after execution
	}

}
