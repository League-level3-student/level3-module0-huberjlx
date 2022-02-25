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

    	for (int i = 0; i < field.length; i++) {
    		String cowString = "";
    		for (int j = 0; j < field[i].length; j++) {
    			cowString += field[i][j];
           		if (cowString.contains("cow")) {
        			leftFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i);
        			cowCoords.add(j - 2);
        		}
    		}
    	}
    	direction += 1;
    	for (int i = 0; i < field.length; i++) {
    		String cowString = "";
    		for (int j = 0; j < field[i].length; j++) {
    			cowString += field[i][j];
           		if (cowString.contains("cow")) {
        			rightFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i);
        			cowCoords.add(j - 2);
        		}
    		}
    	}
    	direction += 1;
    	for (int i = 0; i < field.length; i++) {
    		String cowString = "";
    		for (int j = 0; j < field[i].length; j++) {
    			cowString += field[i][j];
           		if (cowString.contains("cow")) {
        			upFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i);
        			cowCoords.add(j - 2);
        		}
    		}
    	}
    	direction += 1;
    	for (int i = 0; i < field.length; i++) {
    		String cowString = "";
    		for (int j = 0; j < field[i].length; j++) {
    			cowString += field[i][j];
           		if (cowString.contains("cow")) {
        			downFrequency += 1;
        			cowCoords.add(direction);
        			cowCoords.add(i);
        			cowCoords.add(j - 2);
        		}
    		}
    	}
    	if (upFrequency == 1) {
    		for (int i = 0; i < cowCoords.size(); i++) {
    			if (i % 3 == 0) {
    				// if (cowCoords ) // Get index of thing or get thing at index, check if it is the right direction, if it is then get the next 2 items, then return those, otherwise repeat this with the next direction
    			}
    		}
    	}
    	
        return null;
    }
}
