package com.headfirstdesignpatterns.command.simpleremote;

public class LightOffCommand implements Command {
    Light light;

    public void execute() {
        light.off();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
