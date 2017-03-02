package state;

import stateMachine.GumballMachine;

public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("죄송합니다. 매진되었습니다.");	
	}

	public void ejectQuarter() {
		System.out.println("죄송합니다. 매진되었습니다.");	
		
	}

	public void turnCrank() {
		System.out.println("죄송합니다. 매진되었습니다.");	
		
	}

	public void dispense() {
		System.out.println("알맹이가 나갈 수 없습니다.");	
		
	}

}
