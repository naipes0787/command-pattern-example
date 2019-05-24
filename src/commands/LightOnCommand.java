package commands;

import receivers.Light;

/**
 * Command to turn on the light
 */
public class LightOnCommand implements Command {

    // The light is the receiver
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
