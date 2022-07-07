package com.headfirstdesignpatterns.command.simpleremotejava8;

import com.headfirstdesignpatterns.command.simpleremote.LightOffCommand;
import com.headfirstdesignpatterns.command.simpleremote.LightOnCommand;

// this is a client class.
public class RemoteControlTestUsingJava8 {
    public static void main(String[] args) {

        // creating a concrete command - client class responsibility
        Light light = new Light();

        // this is invoker which holds the command and at certain point ask command to carry out request by calling out its execute method
        SimpleRemoteControl remote = new SimpleRemoteControl();


        // invoker holding command (direct command association to invoker using java 8 lambda)
        remote.setCommand(() -> {light.off();});
        // invoker ask to execute command
        remote.buttonWasPressed();



        // invoker holding command (direct command association to invoker using java 8 lambda)
        remote.setCommand(() -> {light.on();});
        // invoker ask to execute command
        remote.buttonWasPressed();

    }
}
