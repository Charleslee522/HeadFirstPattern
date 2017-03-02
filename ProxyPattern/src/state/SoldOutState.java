package state;

import stateMachine.GumballMachine;

public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("�˼��մϴ�. �����Ǿ����ϴ�.");	
	}

	public void ejectQuarter() {
		System.out.println("�˼��մϴ�. �����Ǿ����ϴ�.");	
		
	}

	public void turnCrank() {
		System.out.println("�˼��մϴ�. �����Ǿ����ϴ�.");	
		
	}

	public void dispense() {
		System.out.println("�˸��̰� ���� �� �����ϴ�.");	
		
	}

}
