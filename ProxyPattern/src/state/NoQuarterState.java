package state;

import stateMachine.GumballMachine;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("������ �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	public void ejectQuarter() {
		System.out.println("������ �־��ּ���.");
	}
	
	public void turnCrank() {
		System.out.println("������ �־��ּ���.");
	}
	
	public void dispense() {
		System.out.println("������ �־��ּ���.");
	}

}
