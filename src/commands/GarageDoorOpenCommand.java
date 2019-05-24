package commands;

import Receivers.GarageDoor;

/**
 * Command to open the garage
 */
public class GarageDoorOpenCommand implements Command {

    // The garage is the receiver
    private GarageDoor garage;

    public GarageDoorOpenCommand(GarageDoor garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        this.garage.open();
    }

    @Override
    public void undo() {
        this.garage.close();
    }
}
