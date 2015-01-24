package org.usfirst.frc.team1014.robot.subsystems;

import org.usfirst.frc.team1014.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics extends BadSubsystem
{
	private static Pneumatics instance;

	private static Compressor compressor;
	private static Solenoid solRightLow, solRightHigh, solLeftLow, solLeftHigh;

	public static Pneumatics getInstance()
	{
		if (instance == null)
		{
			instance = new Pneumatics();
		}
		return instance;
	}

	@Override
	protected void initialize()
	{
		compressor = new Compressor(RobotMap.PCM);
		compressor.setClosedLoopControl(true);
		solRightLow = new Solenoid(RobotMap.RIGHT_LOW);
		solRightHigh = new Solenoid(RobotMap.RIGHT_HIGH);
		solLeftLow = new Solenoid(RobotMap.LEFT_LOW);
		solLeftHigh = new Solenoid(RobotMap.LEFT_HIGH);
	}

	@Override
	public String getConsoleIdentity()
	{
		return "Pneumatics";
	}

	@Override
	protected void initDefaultCommand()
	{
		// TODO Auto-generated method stub

	}

	public void shift(boolean high)
	{

		solRightHigh.set(high);
		solLeftHigh.set(high);

		solRightLow.set(!high);
		solLeftLow.set(!high);

	}

}
