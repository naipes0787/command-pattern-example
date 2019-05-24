package commands;

import receivers.GarageDoor;

/**
 * Command to close the garage door
 */
public class GarageDoorCloseCommand implements Command {

    // The garage is the receiver
    private GarageDoor garage;

    public GarageDoorCloseCommand(GarageDoor garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        this.garage.close();
    }

    @Override
    public void undo() {
        this.garage.open();
    }
}
