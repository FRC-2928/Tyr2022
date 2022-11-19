# Tyr2022
Update tyr robot Create fork
Migrating Tyr robot to 2022 WPI

----Initiaal Operator contrfols:
All on driver controller
High gear Y
Low Gear X
RaiseShooter().whileHeld runs_lifter)); //right bumper
LowerShooter().whileHeld runs_lifter)); //left bumper
Intake().whileHeld runs shooterMotors)); //A
Outtake().whileHeld runs shooterMotors)); //B
Spinner().whileHeld runs spinner)); //start 
Shoot().whileHeld runs shooterSolenoid)); // Back
LowerTomahawk().whenPressed // right stick
RaiseTomahawk().whenPressed // left stick
-------------------
TODO Calibrate the lifter by setting the positipon to 0 when it hits the hard limit.

Automate shooting.

Calibrate straight running.

Read gyro to figure chassis angle and ajust shoot angle to compensate.
