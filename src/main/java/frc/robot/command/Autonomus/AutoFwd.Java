package frc.robot.command.autonomus;

import frc.robot.Robot;
import frc.robot.command.Autodrive;
import edu.wpi.first.wpilbj.command.CommandGroup;

public class autoFwd extends CommandGroup {
    public Autodrive autonomusCommand;
    
    public autoFwd(Robot robot){

    }
    public void goForward(Robot robot) {
        addSequential(new AutoFwd(robot.drivetrain, 0.04, 0.0, 0.0 ,5.6));
        addSequential(new AutoFwd(robot.drivetrain, 0.0, 0.5, 0.0, 5.6));
        addSequential(new AutoFwd(robot.drivetrain, 0.0, 0.0, 5.0, 5.6));
    }
}
