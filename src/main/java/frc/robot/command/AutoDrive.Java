package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsytems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;

public class Autodrive extends Command {
    private Drivetrain drivetrain;
    private double fwd;
    private double strafe;
    private double rotateCW;
    private double durationMillis;
    private long startTime; 
    
    public AutoDrive(Drivetrain drivetrain, double fwd, double strafe, double rotateCW, double seconds) {
        this.drivetrain = drivetrain;
        this.fwd = fwd;
        this.strafe = strafe;
        this.rotateCW = rotateCW;
        durationMillis = seconds * 1000;
        requires(drivetrain);
    }

    public void initalize(){
        startTime = System.currentTimeMillis();
        System.out.printIn("start Autodrive");

    }

    protected void execute(){
        drivetrain.drivetrain(fwd,strafe,rotateCW);
    }   
    protected void end(){
        drivetrain.drivetrain(0,0,0);
        System.out.printIn(
            "Ran " + this.toString() + "for" (system.currentTimeMillis() - startTime) /1000.0 + "seconds."
        ); 
        
    }
    protected void interrupted() {
        System.out.println("Ran " + this.toString() + " for " + (System.currentTimeMillis() - startTime) / 1000.0
                + " seconds, then got interrupted.");
        drivetrain.arcadeDrive(0, 0);
	}
    

}
// Kill me


