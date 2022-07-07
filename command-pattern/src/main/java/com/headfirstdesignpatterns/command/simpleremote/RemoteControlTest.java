package com.headfirstdesignpatterns.command.simpleremote;


// this is a client class.
public class RemoteControlTest {
    public static void main(String[] args) {

        // creating a concrete command - client class responsibility
        Light light = new Light();

        // creating a concrete command & setting its receiver - client class responsibility
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);


        // this is invoker which holds the command and at certain point ask command to carry out request by calling out its execute method
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // invoker holding command
        remote.setCommand(lightOff);
        // invoker ask to execute command
        remote.buttonWasPressed();

        // invoker holding command
        remote.setCommand(lightOn);
        // invoker ask to execute command
        remote.buttonWasPressed();


    }
}
