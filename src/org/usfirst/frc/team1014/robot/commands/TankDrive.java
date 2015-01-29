package org.usfirst.frc.team1014.robot.commands;

import org.usfirst.frc.team1014.robot.OI;
import org.usfirst.frc.team1014.robot.subsystems.Pneumatics;

import edu.wpi.first.wpilibj.command.Subsystem;

public class TankDrive extends CommandBase{
	Pneumatics p = Pneumatics.getInstance();

	public TankDrive()
    {
        requires((Subsystem) driveTrain); // This line causes the error
    }

	@Override
	protected void initialize() 
	{
		driveTrain.tankDrive(0, 0);
	}

	public String getConsoleIdentity() 
	{
		return "TankDrive";
	}

	protected void execute() 
	{
		driveTrain.tankDrive(-OI.xboxController.getLeftStickY(), -OI.xboxController.getRightStickY());
		
		if(OI.xboxController.isAButtonPressed()) {
			p.shift(true);
		}
		if(OI.xboxController.isBButtonPressed()) {
			p.shift(false);
		}
	}

	@Override
	protected boolean isFinished() 
	{
		return false;
	}

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
