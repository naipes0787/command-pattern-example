package commands;

import receivers.Stereo;

/**
 * Command to turn on the stereo and to use a CD
 */
public class StereoOnWithCD implements Command {

    // The stereo is the receiver
    private Stereo stereo;

    public StereoOnWithCD(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
