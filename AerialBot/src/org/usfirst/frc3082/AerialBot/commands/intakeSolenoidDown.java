/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc3082.AerialBot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3082.AerialBot.Robot;

/**
 *
 * @author compadmin
 */
public class intakeSolenoidDown extends Command {
    
    public intakeSolenoidDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.airSys);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(0.1);
        Robot.airSys.intakeSolDown();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
