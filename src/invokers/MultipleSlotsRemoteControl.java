package invokers;

import commands.Command;
import commands.NoCommand;

/**
 * This is a remote control which has 7 slots to manage several devices
 */
public class MultipleSlotsRemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public MultipleSlotsRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0; i<7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offComand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offComand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
