/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

import java.util.ArrayList;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int direction = 0; // 0 left-right, 1 = right-left, 2 = up-down, 3 = down-up
        int upFrequency = 0;
        int downFrequency = 0;
        int leftFrequency = 0;
        int rightFrequency = 0;
        
        ArrayList<Integer> cowCoords = new ArrayList<>();
        System.out.println("\n\n Left to Right");
    	for (int i = 0; i < field.length; i++) {
    		String cowString = "";
    		for (int j = 0; j < field[i].length; j++) {
    			cowString += field[i][j];
           		if (cowString.contains("cow")) {
        			leftFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i);
        			cowCoords.add(j - 2);
        			System.out.println("Yes");
        		}
        		System.out.println(cowString);
        		if (cowString.length() == 3) {
               		String newCowString = cowString.substring(1);
               		cowString = newCowString;
        		}
        		//System.out.println(cowString);
    		}
    	}
    	System.out.println("\n\n");
        System.out.println("\n\n Right to left \n\n");
    	direction += 1;
    	for (int r = field.length - 1; r >= 0; r--) {
    		String cowString = "";
    		for (int c = field[r].length - 1; c >= 0; c--) {
    			System.out.println(cowString);
    			cowString += field[r][c];
           		if (cowString.contains("cow")) {
        			rightFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(r);
        			cowCoords.add(c + 2);
        			System.out.println("Yes");
        		}
           		System.out.println(cowString);
        		if (cowString.length() == 3) {
               		String newCowString = cowString.substring(1);
               		cowString = newCowString;
        		}
    		}
    	}
        System.out.println("\n\n Up to Down");
    	direction += 1;
    	int cols = 0;	
    	while (cols < field[0].length) {
    		String cowString = "";
        	for (int i = 0; i < field.length; i++) {
        		cowString += field[i][cols];
           		if (cowString.contains("cow")) {
        			upFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i - 2);
        			cowCoords.add(cols);
        			System.out.println("Yes");
        		}
           		System.out.println(cowString+ " " + cowString.length());
        		if (cowString.length() == 3) {
               		String newCowString = cowString.substring(1);
               		cowString = newCowString;
        		}
        	}
        	cols += 1;
    	} 
        System.out.println("\n\n Down to Up");
    	direction += 1;
    	cols = 0;
    	while (cols < field[0].length) {
    		String cowString = "";
        	for (int i = field.length - 1; i > 0; i--) {
        		//System.out.println("\n\n\n" + cols + " " + i + "\n\n\n");
        		cowString += field[i][cols];
           		if (cowString.contains("cow")) {
        			downFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i + 2);
        			cowCoords.add(cols);
        			System.out.println("Yes");
        		}
           		System.out.println(cowString);
        		if (cowString.length() == 3) {
               		String newCowString = cowString.substring(1);
               		cowString = newCowString;
        		}
        	}
        	cols += 1;
    	} 
//    	System.out.println(cowCoords);
    	int[] array = new int[2];
    	if (upFrequency == 1) {
    		cols = 0;	
        	while (cols < field[0].length) {
        		String cowString = "";
            	for (int i = 0; i < field.length; i++) {
            		cowString += field[i][cols];
               		if (cowString.contains("cow")) {
            			array[0] = (i - 2);
            			array[1] = (cols);
            			return array;
            		}
               		System.out.println(cowString+ " " + cowString.length());
            		if (cowString.length() == 3) {
                   		String newCowString = cowString.substring(1);
                   		cowString = newCowString;
            		}
            	}
            	cols += 1;
        	} 
    	}
    	else if (downFrequency == 1) {
        	cols = 0;
        	while (cols < field[0].length) {
        		String cowString = "";
            	for (int i = field.length - 1; i > 0; i--) {
            		//System.out.println("\n\n\n" + cols + " " + i + "\n\n\n");
            		cowString += field[i][cols];
               		if (cowString.contains("cow")) {
            			array[0] = (i - 2);
            			array[1] = (cols);
            			return array;
            		}
               		System.out.println(cowString);
            		if (cowString.length() == 3) {
                   		String newCowString = cowString.substring(1);
                   		cowString = newCowString;
            		}
            	}
            	cols += 1;
        	} 
    	}
    	else if (rightFrequency == 1) {
        	for (int r = field.length - 1; r >= 0; r--) {
        		String cowString = "";
        		for (int c = field[r].length - 1; c >= 0; c--) {
        			System.out.println(cowString);
        			cowString += field[r][c];
               		if (cowString.contains("cow")) {
            			array[0] = (r);
            			array[1] = (c + 2);
            			return array;
            		}
               		System.out.println(cowString);
            		if (cowString.length() == 3) {
                   		String newCowString = cowString.substring(1);
                   		cowString = newCowString;
            		}
        		}
        	}
    	}
    	else {
    		for (int i = 0; i < field.length; i++) {
        		String cowString = "";
        		for (int j = 0; j < field[i].length; j++) {
        			cowString += field[i][j];
               		if (cowString.contains("cow")) {
            			leftFrequency += 1;
            			cowCoords.add(direction);
            			cowCoords.add(i);
            			cowCoords.add(j - 2);
            			System.out.println("Yes");
            		}
            		System.out.println(cowString);
            		if (cowString.length() == 3) {
                   		String newCowString = cowString.substring(1);
                   		cowString = newCowString;
            		}
            		//System.out.println(cowString);
        		}
        	}
    	}
		//System.out.println(upFrequency + " " + downFrequency + " " + leftFrequency + " " + rightFrequency + " " + cowCoords);
        return array;
    }
}
