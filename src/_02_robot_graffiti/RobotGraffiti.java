package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	
	public static void main(String[] args) throws Exception {

		Robot joe = new Robot();
 	joe.setSpeed(100);
		//drawing 'A'
 	joe.turn(-90);
	joe.penDown();
	joe.turn(120);
	joe.move(200);
	joe.turn (120);
	joe.move(200);
	joe.turn(180);
	joe.move(100);
	joe.turn(-60);
	joe.move(100);
	
	
	joe.penUp();
	joe.turn(180);
	joe.move(300);
	}
}
