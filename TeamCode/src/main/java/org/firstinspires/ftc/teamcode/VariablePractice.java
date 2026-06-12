package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int TeamNumber = 19448;
        double MotorSpeed = 0.75;
        boolean Intakeon = true;
        String TeamName = "Team 19448";


        telemetry.addData("Team Number", TeamNumber);
        telemetry.addData("MotorSpeed", MotorSpeed);
        telemetry.addData("Intake State", Intakeon);
        telemetry.addData("Team Name", TeamName);
    }

    @Override
    public void loop() {


    }
}