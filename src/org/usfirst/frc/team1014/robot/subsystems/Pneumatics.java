package org.usfirst.frc.team1014.robot.subsystems;

import org.usfirst.frc.team1014.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics extends BadSubsystem {
  private static Pneumatics instance;

  private static Compressor compressor;
  private static Solenoid solenoidTest;

  public static Pneumatics getInstance()
  {
      if (instance == null)
      {
          instance = new Pneumatics();
      }
      return instance;
  }
  
  @Override
  protected void initialize() {
    compressor = new Compressor(RobotMap.PCM);
    compressor.setClosedLoopControl(true);
    solenoidTest = new Solenoid(0);
  }

  @Override
  public String getConsoleIdentity() {
    return "Pneumatics";
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }

}
