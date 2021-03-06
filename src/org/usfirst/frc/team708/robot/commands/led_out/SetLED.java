package org.usfirst.frc.team708.robot.commands.led_out;
import org.usfirst.frc.team708.robot.Constants;
import org.usfirst.frc.team708.robot.RobotMap;
import org.usfirst.frc.team708.robot.util.Gamepad;
import org.usfirst.frc.team708.robot.Robot;
import org.usfirst.frc.team708.robot.OI;
import org.usfirst.frc.team708.robot.subsystems.LED;
import org.usfirst.frc.team708.robot.subsystems.Drivetrain;


import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;

//import org.team708.robot.OI;
//import org.team708.robot.subsystems.Loader;
//import org.team708.robot.util.Gamepad;
//import org.team708.robot.commands.shooter.Fire;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class SetLED extends Command {

	static public byte ledcolor;

    public SetLED(byte ledcolor) {
//    	requires(Robot.led1);
    	this.ledcolor = ledcolor;
    }
    
// Called just before this Command runs the first time
    protected void initialize() {
		Robot.led1.send_to_led(ledcolor);
	}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {    	

//    	Robot.led1.send_to_led(ledcolor);
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems are scheduled to run
    protected void interrupted() {
    	end();
    }
}
