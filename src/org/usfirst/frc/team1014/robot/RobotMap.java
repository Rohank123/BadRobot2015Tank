package org.usfirst.frc.team1014.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Analogs
	public static final int frontLeftController = 1;
	public static final int backLeftController = 0;
	public static final int frontRightController = 3;
	public static final int backRightController = 2;
	
	//DIO
	public static final int brokenGyro = 0;
	public static final int properGyro = 1;
	public static final int backUltrasonicPing = 8;
	public static final int backUltrasonicEcho  = 9;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//CAN IDs
	public static final int PCM = 0; 
}
