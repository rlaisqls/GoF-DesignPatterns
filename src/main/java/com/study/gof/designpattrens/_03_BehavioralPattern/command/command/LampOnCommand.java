package com.study.gof.designpattrens._03_BehavioralPattern.command.command;

import com.study.gof.designpattrens._03_BehavioralPattern.command.device.Lamp;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LampOnCommand implements Command {

    private final Lamp lamp;

    @Override
    public void execute() {
        lamp.setPower(true);
    }
}