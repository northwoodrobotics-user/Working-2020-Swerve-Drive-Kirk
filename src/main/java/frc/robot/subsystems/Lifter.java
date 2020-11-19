/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.command.teleop.Telelift;

/**
 * Add your docs here.
 */
public class Lifter extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.




  private WPI_TalonSRX m1;

	public Lifter() {
    m1 = new WPI_TalonSRX(RobotMap.m1);
		
		m1.setInverted(RobotMap.pipeInverse);

    m1.configOpenloopRamp(0.5);
  }

	public void setSpeed(double speed) {
		m1.set(ControlMode.PercentOutput, speed);
	}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Telelift(this));
  }
}
