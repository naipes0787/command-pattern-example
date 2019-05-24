import commands.LightOnCommand;
import receivers.Light;
import invokers.SimpleRemoteControl;

public class RemoteControlMain {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setSlotCommand(lightOnCommand);
        remoteControl.buttonWasPressed();

        System.out.println(light.getIsOn().toString());
    }

}
