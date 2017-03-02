package test;

import item.GarageDoor;
import item.Light;
import command.GarageDoorOpenCommand;
import command.LightOnCommand;
import control.SimpleRemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonwasPressed();
		remote.setCommand(garageDoorOpen);
		remote.buttonwasPressed();
		
	}
}
