package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by NoMythic on 12/15/2015.
 */
public class DriveForwardAutonomous extends LinearOpMode{
    DcMotor leftMotor;
    DcMotor  rightMotor;


    @Override
    public void runOpMode () throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("Left motor");
        rightMotor = hardwareMap.dcMotor.get("Right motor");
        leftMotor.setDirection(DcMotor.Direction.REVERSE);

        leftMotor.setTargetPosition(15552);
        rightMotor.setTargetPosition(15552);
    }

}
