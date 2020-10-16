//Marty was here 
package frc.robot.command.autonomous;

import frc.robot.Robot;
import frc.robot.command.AutoDrive;

import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoMove  extends CommandGroup {
	public AutoDrive autonomousCommand; 


	public autoMove(final Robot robot) {
	}

	public void goForward(final Robot robot) {

	//addSequential(new AutoDrive(robot.drivetrain, turn, forward/back, time));//turn right
	 addSequential(new AutoDrive(robot.drivetrain, 0.5, 0.0, 0.0, 0.5));//go foward 
	 //addSequential(new AutoDrive(robot.drivetrain, 0.5, 0.0, 0.8));//Turn right
	 //addSequential(new AutoDrive(robot.drivetrain, 0.0, 0.5, 1.1));//go forward
	 //addSequential(new AutoDrive(robot.drivetrain, 0.6, 0.0, 0.5));//turn right
	 //addSequential(new AutoDrive(robot.drivetrain, 0.0, 0.5, 0.7));//go forward
	 //addSequential(new AutoDrive(robot.drivetrain, -0.5, 0.0, 0.6));//Turn left
	 //addSequential(new AutoDrive(robot.drivetrain, 0.0, 0.5, 1.2));//go forward
	 //addSequential(new AutoDrive(robot.drivetrain, 0.3, 0.0, 4.3));//go forward
	 //addSequential(new AutoDrive(robot.drivetrain, 0, -0.4, 2.5));//strafe left
		
	}

	public void goBackward(final Robot robot) {
	
	}
}