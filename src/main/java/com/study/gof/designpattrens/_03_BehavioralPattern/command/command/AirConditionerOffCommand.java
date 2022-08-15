package com.study.gof.designpattrens._03_BehavioralPattern.command.command;

import com.study.gof.designpattrens._03_BehavioralPattern.command.device.AirConditioner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AirConditionerOffCommand implements Command {

    private final AirConditioner airConditioner;

    @Override
    public void execute() {
        airConditioner.setPower(false);
    }
}