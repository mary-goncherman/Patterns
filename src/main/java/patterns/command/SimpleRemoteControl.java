package main.java.patterns.command;

public class SimpleRemoteControl {
    public Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
