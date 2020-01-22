/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


/**
 * Add your docs here.
 */

public class colorWheel extends Subsystem {

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // default commands always run no matter what
    setDefaultCommand(new TankDrive()); // always make a new instance of the command
  }

  public void configureColour() { 
    //call during teleopInit
    private final I2C.Port i2cPort = I2C.Port.kOnboard;

    /**
     * A Rev Color Sensor V3 object is constructed with an I2C port as a 
     * parameter. The device will be automatically initialized with default 
     * parameters.
     */
    private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);
  
    /**
     * A Rev Color Match object is used to register and detect known colors. This can 
     * be calibrated ahead of time or during operation.
     * 
     * This object uses a simple euclidian distance to estimate the closest match
     * with given confidence range.
     */
    private final ColorMatch m_colorMatcher = new ColorMatch();

  }

  
  public void setLeftMotors(double speed) {   
    //make one side reversed
    leftMotor1.set(ControlMode.PercentOutput, -speed);
    //leftMotor2.set(ControlMode.PercentOutput, -speed);
  }



}
