package com.study.gof.designpattrens._03_BehavioralPattern.command.device;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class AirConditioner {
    private boolean power;

    public boolean isOn(){
        return power;
    }
}