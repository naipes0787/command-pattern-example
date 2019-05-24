package receivers;

/**
 * The stereo is one of the things that we want to manage with our control
 */
public class Stereo {

    Boolean isOn;
    Boolean usingCd;

    public Stereo() {
        this.isOn = Boolean.FALSE;
        this.usingCd = Boolean.FALSE;
    }

    public void on() {
        this.isOn = Boolean.TRUE;
    }

    public void off() {
        this.isOn = Boolean.FALSE;
    }

    public void setCd(){
        this.usingCd = Boolean.TRUE;
    }

    public void setRadio() {
        this.usingCd = Boolean.FALSE;
    }

    public Boolean getIsOn(){
        return this.isOn;
    }

}
