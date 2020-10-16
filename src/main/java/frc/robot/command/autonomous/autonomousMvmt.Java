package frc.robot.command.autonomous;

import frc.robot.Robot;
import frc.robot.command.Autodrive;
import edu.wpi.first.wpilbj.command.CommandGroup;



public class autonomousMvmt extends CommandGroup {
    public AutoDrive autonomousCommand; 
    

    public void goForward(Robot robot) {
        addSequential(new AutoFwd(robot.drivetrain, 0.04, 0.0, 0.0 ,5.6));
        addSequential(new AutoFwd(robot.drivetrain, 0.0, 0.5, 0.0, 5.6));
        addSequential(new AutoFwd(robot.drivetrain, 0.0, 0.0, 5.0, 5.6));
    }


	public autonomousMvmt(Robot robot) {
	}


	public void solveMaze(Robot robot) {
		//addSequential(new AutoDrive(robot.drivetrain, 0.5, 0.0, 0.0, 2.0));//go forward
		//addSequential(new AutoDrive(robot.drivetrain, 0, -1.0, 0.0, 3.0));//strafe left
		//addSequential(new AutoDrive(robot.drivetrain, 0.0, 0.0, 1.0, 1.0)); //rotate right
		//addSequential(new AutoDrive(robot.drivetrain, 1.0, 0.0, .0, 1.0));//go forward
		//addSequential(new AutoDrive(robot.drivetrain, 0, 1.0, 0.0, 1.0)); //rotate right
		//addSequential(new AutoDrive(robot.drivetrain, 1.0, 0.0, 1.0, 1.0));//go forward



   }

	public void goForward(Robot robot) {

		 //addSequential(new AutoDrive(robot.drivetrain, 0, 0, 0.3, 2.0)); //rotate right 

		//addSequential(new AutoDrive(robot.drivetrain, -1.0, 0.0, 0.5, 1.0));//go backward
		
		//addSequential(new AutoDrive(robot.drivetrain, 0.0, 1.0, 0.0, 3.0)); //strafe right 
		//addSequential(new AutoDrive(robot.drivetrain, 0, 0, 10.0, 1.0)); //rotate right 
		//addSequential(new AutoDrive(robot.drivetrain, 0.6, 0, 10.0, 1.0));//rotate left 


	}

	public void goBackward(Robot robot) {
		//addSequential(new AutoDrive(robot.drivetrain,-0.5, 0, 0.0, 0.3 ));
		//addSequential(new AutoDrive(robot.drivetrain, 0, 0, -.20, .65));
		//addSequential(new AutoDrive(robot.drivetrain, -0.6, 0, 0, 1.3));
		//addSequential(new AutoDrive(robot.drivetrain, 0, 0, .25, .65));
		//addSequential(new AutoDrive(robot.drivetrain, -.5, 0, 0, .5));
		//addSequential(new AutoDrive(robot.drivetrain, 0.0, 0.0, 0.0, 0.30));
		//addSequential(new AutoDrive(robot.drivetrain, 0, 0.5, 0.0, 1.4));
		//addSequential(new AutoDrive(robot.drivetrain, -0.5, 0.0, 0.0, 1.57));
	}
}

