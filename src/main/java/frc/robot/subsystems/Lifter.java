package frc.robot.subsystems;

// import org.usfirst.frc.team2928.robot.RobotMap;

// import com.ctre.CANTalon;

// import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX; // tyr
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX; // tyr


public class Lifter extends SubsystemBase {
	private WPI_TalonSRX motor;
	public static int lifterMotor = 4;
	public Lifter() {
		this.motor = new WPI_TalonSRX(lifterMotor);
	}

	// public Lifter(String name) {
	// 	super(name);
	// 	// TODO Auto-generated constructor stub
	// }
	
	public void Raise()
	{
		this.motor.set(.85);
	}
	
	public void Lower()
	{
		this.motor.set(-.85);
	}
	
	public void RunAtSpeed(float speed)
	{
		if (speed > .85 || speed < -.85)
		{
			this.motor.set(0);
			return;
		}
		this.motor.set(speed);
	}
	public void Stop()
	{
		this.motor.set(0);
	}
	public int lifterPos()
	{
		// return motor.getEncPosition();
		System.out.println(">>>>>>Lifter SRX POSITION TBD !!!!!");
		return 0;
	}
	// @Override
	// protected void initDefaultCommand() {
	// 	// TODO Auto-generated method stub

	// }

}
