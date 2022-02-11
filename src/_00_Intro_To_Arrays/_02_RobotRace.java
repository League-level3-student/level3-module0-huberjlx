package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		for (int i = 0; i < robots.length; i++) {
			Robot robotThing = new Robot();
			robots[i] = robotThing;
			robotThing.setX(50 + 100 * i);
			robotThing.setY(550);
			robotThing.setSpeed(5);
		}
		boolean isWinner = false;
		Random rand = new Random();
		while (!isWinner) {
			for (Robot robotRacer : robots) {
				int moveDist = rand.nextInt(0, 50);
				for (int i = 0; i <= moveDist; i++) {
					robotRacer.move(1);
					robotRacer.turn(1);
				}
				if (robotRacer.getY() <= 0) {
					isWinner = true;
					System.out.println("Robot won");
				}
			}
		}
	}
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
