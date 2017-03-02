package state;

import stateMachine.GumballMachine;

public class HasQuarterState implements State {
	
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("������ �� ���� �־��ּ���.");
	}

	public void ejectQuarter() {
		System.out.println("������ ��ȯ�˴ϴ�.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("�����̸� �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense() {
		System.out.println("�˸��̰� ���� �� �����ϴ�.");
	}

}
