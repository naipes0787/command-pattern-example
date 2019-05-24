package commands;

import Receivers.Stereo;

/**
 * Command to turn off the stereo
 */
public class StereoOff implements Command {

    // The stereo is the receiver
    private Stereo stereo;

    public StereoOff(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }

    @Override
    public void undo() {
        this.stereo.on();
    }
}
