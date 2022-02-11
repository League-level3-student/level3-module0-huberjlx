package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] strings = new String[5];
        // 2. print the third element in the array
    	System.out.println(strings[3]);
        // 3. set the third element to a different value
    	strings[3] = "stuff";
        // 4. print the third element again
    	System.out.println(strings[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i = 0; i < strings.length; i++) {
    		strings[i] = "More stuff";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i = 0; i < strings.length; i++) {
    		System.out.println(strings[i]);
    	}
        // 7. make an array of 50 integers
    	int[] ints = new int[50];
    	// 8. use a for loop to make every value of the integer array a random
        //    number
    	Random rand = new Random();
    	for (int i = 0; i< ints.length; i++) {
    		ints[i] = rand.nextInt(0, 100);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int smallest = ints[0];
    	int largest = ints[0];
    	for (int integer : ints) {
    		if (integer < smallest) {
    			smallest = integer;
    		}
    		if (integer > largest) {
    			largest = integer;
    		}
    	}
    	System.out.println(smallest);

        // 10 print the entire array to see if step 8 was correct
        for(Integer i : ints){
            System.out.println("int: " + i);
        }
        // 11. print the largest number in the array.
        System.out.println(largest);
        // 12. print only the last element in the array
        System.out.println(ints[ints.length - 1]);
    }
}
