package com.study.gof.designpattrens._03_BehavioralPattern.command;

import com.study.gof.designpattrens._03_BehavioralPattern.command.command.AirConditionerOffCommand;
import com.study.gof.designpattrens._03_BehavioralPattern.command.command.AirConditionerOnCommand;
import com.study.gof.designpattrens._03_BehavioralPattern.command.command.LampOffCommand;
import com.study.gof.designpattrens._03_BehavioralPattern.command.command.LampOnCommand;
import com.study.gof.designpattrens._03_BehavioralPattern.command.device.AirConditioner;
import com.study.gof.designpattrens._03_BehavioralPattern.command.device.Lamp;

public class App {

    public static void main(String[] args) {
        //커맨드를 주입하여 한 메서드가 여러 기능을 실행하도록 할 수 있다.
        AirConditioner airConditioner = new AirConditioner(false);
        Lamp lamp = new Lamp(false);

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("lamp");
        System.out.println(lamp.isOn());

        remoteControl.setCommand(new LampOnCommand(lamp));
        remoteControl.pressButton();
        System.out.println(lamp.isOn());

        remoteControl.setCommand(new LampOffCommand(lamp));
        remoteControl.pressButton();
        System.out.println(lamp.isOn());

        System.out.println("airConditioner");
        System.out.println(airConditioner.isOn());

        remoteControl.setCommand(new AirConditionerOnCommand(airConditioner));
        remoteControl.pressButton();
        System.out.println(airConditioner.isOn());

        remoteControl.setCommand(new AirConditionerOffCommand(airConditioner));
        remoteControl.pressButton();
        System.out.println(airConditioner.isOn());

    }
}