package frc.robot.command.button;



import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.Locker;




public class ToggleFlipper extends Command {
    private Locker locker;

    public ToggleFlipper(Locker charlie){
        locker = charlie;
        requires(locker);



    }


    public ToggleFlipper(){

    }

    @Override
    protected void initialize(){
        
    }


    @Override
    protected void execute(){

    }
    
    @Override 
    protected boolean isFinished(){
        return true;
    }


    @Override
    protected void end(){
        if (locker.getPosition() == Value.kForward){
            locker.RFlipUp();
            System.out.println("Locked");
        } else {
            locker.RFlipDown();

            System.out.println("Unlocked");
        }
 

    }

    @Override
    protected void interrupted(){
        
    }






}