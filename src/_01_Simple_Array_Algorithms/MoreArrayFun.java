package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"};
		strings(arr);
		System.out.println("\n");
		reverseStrings(arr);
		System.out.println("\n");
		alternatingStrings(arr);
		System.out.println("\n");
		randomStrings(arr);
	}
	
	public static void strings(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}
	
	public static void reverseStrings(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void alternatingStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void randomStrings(String[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			int newPos = rand.nextInt(arr.length);
			String temp = arr[i];
			arr[i] = arr[newPos];
			arr[newPos] = temp;
			
		}
		String arrayString = "";
		for (String str : arr) {
			arrayString += str + ", ";
		}
		System.out.println(arrayString);
	}
	
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.



    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	


    //4. Write a method that takes an array of Strings and prints every other String in the array.


    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
