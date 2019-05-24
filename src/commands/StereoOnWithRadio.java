package commands;

import receivers.Stereo;

/**
 * Command to turn on the stereo and to use the radio
 */
public class StereoOnWithRadio implements Command {

    // The stereo is the receiver
    private Stereo stereo;

    public StereoOnWithRadio(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setRadio();
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
