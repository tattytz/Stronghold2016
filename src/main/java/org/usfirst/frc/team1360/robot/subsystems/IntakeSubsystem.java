package org.usfirst.frc.team1360.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team1360.robot.RobotMap;

/**
 * Created by Michael on 2016-01-28.
 */
public class IntakeSubsystem extends Subsystem {

    @Override
    protected void initDefaultCommand()
    {

    }

    private final Victor INTAKE_1 = new Victor(RobotMap.INTAKE_MOTOR);


    public void intakeBoulder(double motor)
    {
        INTAKE_1.set(motor);
    }

}
