package control;

import command.Command;
import command.NoCommand;

public class RemoteControl {
	public static final int SIZE = 7;
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[SIZE];
		offCommands = new Command[SIZE];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < SIZE; ++i) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) throws Exception {
		
		if(slot >= SIZE) {
			throw new Exception("slot size overflow");
		}
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		
		stringBuff.append("\n------ Remote Control ------\n");
		for(int i = 0; i < onCommands.length; ++i) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
					+ "     " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
