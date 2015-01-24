package org.usfirst.frc.team1014.robot.subsystems;

import org.usfirst.frc.team1014.robot.RobotMap;
import org.usfirst.frc.team1014.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Ultrasonic;

public class TankDriveTrain extends BadSubsystem {
	private static TankDriveTrain instance;
	
	RobotDrive train;
	SpeedController frontLeft, backLeft, frontRight, backRight;
	Ultrasonic backUltrasonic;
	
    public static TankDriveTrain getInstance()
    {
        if (instance == null)
        {
            instance = new TankDriveTrain();
        }
        return instance;
    }
	
    private TankDriveTrain()
    {
    	
    }
    
    @Override
	protected void initialize()
    {
        frontLeft = new Talon(RobotMap.frontLeftController);
        backLeft = new Talon(RobotMap.backLeftController);
        frontRight = new Talon(RobotMap.frontRightController);
        backRight = new Talon(RobotMap.backRightController); 
        
    	train = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	}

	@Override
	public String getConsoleIdentity() 
	{
		return "MikeDriveTrain";
	}

	@Override
	protected void initDefaultCommand() 
	{
		this.setDefaultCommand(new TankDrive()); 
	}
	
    public void tankDrive(double leftY, double rightY) //analogs
    {
        train.tankDrive(leftY, rightY);
    }
    
    public void setMotors(double fl, double bl, double fr, double br)
    {
    	frontLeft.set(fl);
    	backLeft.set(bl);
    	frontRight.set(fr);
    	backRight.set(br);
    }

	public static void so(Object so)
	{
		System.out.println("MikeDriveTainr: " + so);
	}
}
