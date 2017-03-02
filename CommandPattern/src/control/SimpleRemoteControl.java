package control;

import command.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() { }
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonwasPressed() {
		slot.execute();
	}
	
	
}
