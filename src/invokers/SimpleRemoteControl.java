package invokers;

import commands.Command;

/**
 * This is the remote control, which can manage one thing at a time
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    // The devices associated with the slots are interchangeables
    public void setSlotCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
