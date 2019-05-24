package receivers;

/**
 * The light is one of the things that we want to manage with our control
 */
public class Light {

    Boolean isOn;

    public Light() {
        this.isOn = Boolean.FALSE;
    }

    public void on() {
        this.isOn = Boolean.TRUE;
    }

    public void off() {
        this.isOn = Boolean.FALSE;
    }

    public Boolean getIsOn(){
        return this.isOn;
    }

}
