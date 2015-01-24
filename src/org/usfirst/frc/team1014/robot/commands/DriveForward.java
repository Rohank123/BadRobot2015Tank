package org.usfirst.frc.team1014.robot.commands;

import edu.wpi.first.wpilibj.Utility;

/**
 * Drives the robot forward for a time and speed.
 * 
 * @author Dominik
 *
 */
public class DriveForward extends CommandBase
{

	long startTime, currentTime, endTime, driveTime;
	double speed;

	/**
	 * Constructor for DriveBackward
	 * 
	 * @param driveTime
	 *            Time to drive in nanoseconds
	 * @param speed
	 *            Speed at witch to drive
	 */
	public DriveForward(long driveTime, double speed)
	{
		// requires((Subsystem) driveTrain);
		this.driveTime = driveTime;
		this.speed = speed;
	}

	/**
	 * Initializes the command, starts counting down time.
	 */
	@Override
	protected void initialize()
	{
		startTime = Utility.getFPGATime();
		endTime = driveTime + startTime;
	}

	/**
	 * Class identifier for use in logging to the console.
	 * 
	 * @return Class name
	 */
	@Override
	public String getConsoleIdentity()
	{
		return "DriveForward";
	}

	/**
	 * Updates the drive train and updates time.
	 */
	@Override
	protected void execute()
	{
		currentTime = Utility.getFPGATime();
		if (currentTime < endTime)
		{
			driveTrain.tankDrive(speed, speed);
		}
	}

	/**
	 * Returns true if the command is over.
	 * 
	 * @return the state of the command.
	 */
	@Override
	protected boolean isFinished()
	{
		currentTime = Utility.getFPGATime();
		return currentTime > endTime;
	}

	/**
	 * Stops the command, stops drive train.
	 */
	@Override
	protected void end()
	{
		driveTrain.tankDrive(0, 0);
	}

	
	@Override
	protected void interrupted()
	{

	}

}
