package org.usfirst.frc.team1014.robot.commands.autonomouscommandgroups;

import org.usfirst.frc.team1014.robot.commands.DriveBackward;
import org.usfirst.frc.team1014.robot.commands.DriveForward;
import org.usfirst.frc.team1014.robot.commands.SwitchToHighGear;
import org.usfirst.frc.team1014.robot.commands.SwitchToLowGear;
import org.usfirst.frc.team1014.robot.commands.TurnLeft;
import org.usfirst.frc.team1014.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Command group testing all methods, including pnumatics and
 * @author Dominik
 *
 */
public class DriveTestAll extends CommandGroup
{
	public static long DRIVE_TIME = 1000000, TURN_TIME = 1000000;
	public static double SPEED= .5;

	/**
	 * Constructor for DriveTestAll
	 */
	public DriveTestAll()
	{
		this.addSequential(new SwitchToLowGear(100000));
		
		this.addSequential(new TurnLeft(DRIVE_TIME, SPEED));
		this.addSequential(new TurnRight(DRIVE_TIME, SPEED));
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new DriveBackward(DRIVE_TIME, SPEED));
		
		this.addSequential(new SwitchToHighGear(100000));
		
		this.addSequential(new TurnLeft(DRIVE_TIME, SPEED));
		this.addSequential(new TurnRight(DRIVE_TIME, SPEED));
		this.addSequential(new DriveForward(DRIVE_TIME, SPEED));
		this.addSequential(new DriveBackward(DRIVE_TIME, SPEED));
	}
	
	/**
	 * Initializes the command group.
	 */
	public void initialize()
    {
        super.initialize();
    }

}
