/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX leftMotor1 = new TalonSRX(RobotMap.LEFT_MOTOR_1_ID);
  private TalonSRX rightMotor1 = new TalonSRX(RobotMap.RIGHT_MOTOR_1_ID);
  private TalonSRX leftMotor2 = new TalonSRX(RobotMap.LEFT_MOTOR_1_ID);
  private TalonSRX rightMotor2 = new TalonSRX(RobotMap.RIGHT_MOTOR_1_ID);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // default commands always run no matter what
    setDefaultCommand(new TankDrive()); // always make a new instance of the command
  }

  public void setLeftMotors(double speed) {
    //make one side reversed
    leftMotor1.set(ControlMode.PercentOutput, -speed);
    leftMotor2.set(ControlMode.PercentOutput, -speed);
  }

  public void setRightMotors(double speed) {
    rightMotor1.set(ControlMode.PercentOutput, speed);
    rightMotor2.set(ControlMode.PercentOutput, speed);
  }
}
