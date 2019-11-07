/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double joyStickY = Robot.m_oi.GetStickRawAxis(RobotMap.JOYSTICK_Y);
    //double leftStickY = Robot.m_oi.GetStickRawAxis(RobotMap.LEFT_STICK_Y);
    //double rightStickY = Robot.m_oi.GetStickRawAxis(RobotMap.RIGHT_STICK_Y);

    Robot.driveTrain.setLeftMotors(joyStickY);
    Robot.driveTrain.setRightMotors(joyStickY);
    //Robot.driveTrain.setLeftMotors(leftStickY);
    //Robot.driveTrain.setRightMotors(rightStickY);

    //Robot.driveTrain.setLeftMotors(leftStickY);
    //Robot.driveTrain.setRightMotors(rightStickY);
  }

  // Make this return true when this Command no longer needs to run execute()
  // called every time after execute
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }
}
