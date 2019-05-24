package receivers;

/**
 * The garage door is one of the things that we want to manage with our control
 */
public class GarageDoor {

    Boolean isOpen;

    public GarageDoor() {
        this.isOpen = Boolean.FALSE;
    }

    public void open() {
        this.isOpen = Boolean.TRUE;
    }

    public void close() {
        this.isOpen = Boolean.FALSE;
    }

    public Boolean getIsOpen(){
        return this.isOpen;
    }

}
