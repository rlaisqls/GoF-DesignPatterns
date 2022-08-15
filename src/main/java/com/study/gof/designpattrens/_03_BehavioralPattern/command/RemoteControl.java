package com.study.gof.designpattrens._03_BehavioralPattern.command;

import com.study.gof.designpattrens._03_BehavioralPattern.command.command.Command;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class RemoteControl {

    private Command command;

    void pressButton() {
        if (command != null){
            command.execute();
        }
    }
}