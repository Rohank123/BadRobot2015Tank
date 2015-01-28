package org.usfirst.frc.team1014.robot.commands;

import edu.wpi.first.wpilibj.Utility;

/**
 * CommandBase that switches all pneumatics to low gear state.
 * @author Dominik
 *
 */
public class SwitchToLowGear extends CommandBase
{

	long startTime, currentTime, endTime, driveTime;

	/**
	 * Constructor for SwitchToLowGear, switches gears to low on first execute.
	 * @param driveTime
	 */
	public SwitchToLowGear(long driveTime)
	{
		// requires((Subsystem) driveTrain);
		this.driveTime = driveTime;
	}

	/**
	 * Initializes the method, starts timer.
	 */
	@Override
	protected void initialize()
	{
		startTime = Utility.getFPGATime();
		endTime = driveTime + startTime;
	}

	/**
	 * @return Returns the name of the class as String.
	 */
	@Override
	public String getConsoleIdentity()
	{
		return "DriveForward";
	}
	
	/**
	 * Executes the commands, switches to low gear on first run.
	 */
	@Override
	protected void execute()
	{
		currentTime = Utility.getFPGATime();
		if (currentTime < endTime)
		{
			pneumatics.shift(false);
		}
	}

	/**
	 * @return Returns true if the method is done.
	 */
	@Override
	protected boolean isFinished()
	{
		currentTime = Utility.getFPGATime();
		return currentTime > endTime;
	}

	@Override
	protected void end()
	{
		
	}

	
	@Override
	protected void interrupted()
	{

	}

}
