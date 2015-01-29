package org.usfirst.frc.team1014.robot.commands;

import edu.wpi.first.wpilibj.Utility;

/**
 * CommandBase that switches all pneumatics to high gear state.
 * @author Dominik
 *
 */
public class SwitchToHighGear extends CommandBase
{

	long startTime, currentTime, endTime, driveTime;

	/**
	 * Constructor for SwitchToHighGear, switches gears to high on first execute.
	 * @param driveTime
	 */
	public SwitchToHighGear(long driveTime)
	{
		// requires((Subsystem) driveTrain);
		this.driveTime = driveTime;
	}

	@Override
	/**
	 * Initializes the method, starts timer.
	 */
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
		return "SwitchToHighGear";
	}
	
	/**
	 * Executes the commands, switches to high gear on first run.
	 */
	@Override
	protected void execute()
	{
		currentTime = Utility.getFPGATime();
		if (currentTime < endTime)
		{
			pneumatics.shift(true);
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
