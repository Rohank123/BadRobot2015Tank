package org.usfirst.frc.team1014.robot.commands.autonomouscommandgroups;

import org.usfirst.frc.team1014.robot.commands.DriveForward;
import org.usfirst.frc.team1014.robot.commands.TurnLeft;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * A testing command group for basic auto control.
 * @author Dominik
 *
 */
public class DriveTestSquare extends CommandGroup
{
	public static long DRIVE_TIME = 1000000, TURN_TIME = 1000000;
	public static double SPEED= .5;

	/**
	 * Constructor for DriveTestSquare.
	 */
	public DriveTestSquare()
	{
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new TurnLeft(TURN_TIME, SPEED));
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new TurnLeft(TURN_TIME, SPEED));
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new TurnLeft(TURN_TIME, SPEED));
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new TurnLeft(TURN_TIME, SPEED));
	}
	
	/**
	 * Initializes the command group.
	 */
	public void initialize()
    {
        super.initialize();
    }

}
