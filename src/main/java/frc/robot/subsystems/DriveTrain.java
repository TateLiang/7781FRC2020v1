/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {

  private WPI_TalonSRX leftMotor1 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_1_ID);
  private WPI_TalonSRX leftMotor2 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_1_ID);
  private WPI_TalonSRX rightMotor1 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_1_ID);
  private WPI_TalonSRX rightMotor2 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_1_ID);

  SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftMotor1, leftMotor2);
  SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor1, rightMotor2);

  DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // default commands always run no matter what
    setDefaultCommand(new TankDrive()); // always make a new instance of the command
  }

  public void configureMotors() { //call during teleopInit
    //Ensure motor output is neutral during init
    leftMotor1.configFactoryDefault();
    leftMotor2.configFactoryDefault();
    rightMotor1.configFactoryDefault();
    rightMotor2.configFactoryDefault();

    // Set neutral mode
    leftMotor1.setNeutralMode(NeutralMode.Brake);
    leftMotor2.setNeutralMode(NeutralMode.Brake);
    rightMotor1.setNeutralMode(NeutralMode.Brake);
    rightMotor2.setNeutralMode(NeutralMode.Brake);

    //adjust directionality
    leftMotor1.setInverted(false);
    leftMotor2.setInverted(false);
    rightMotor1.setInverted(true);
    rightMotor2.setInverted(true);
  }

  public void arcadeDrive(double forward, double turn) {
    drive.arcadeDrive(forward, turn);
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
