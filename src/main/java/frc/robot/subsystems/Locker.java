package frc.robot.subsystems;


import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Locker extends Subsystem{


    public DoubleSolenoid RFlipper = new DoubleSolenoid(1, 0);
  

    public void RFlipUp(){
        RFlipper.set(Value.kForward);
       
    }


    public void  RFlipDown(){
        RFlipper.set(Value.kReverse);
    }


    public Value getPosition(){
        return RFlipper.get();
    }














    public void initDefaultCommand(){
        // this is just here so its happy
        // you can set the default command for this subsytem here. 
    }


}
