package state;

import stateMachine.GumballMachine;

public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("��� ��ٷ��ּ���. �˸��̰� ������ �ֽ��ϴ�.");
	}

	public void ejectQuarter() {
		System.out.println("�̹� �˸��̸� �����̽��ϴ�.");
	}

	public void turnCrank() {
		System.out.println("�����̸� �� ���� �����ּ���.");
	}

	public void dispense() {
		System.out.println("���ϵ帳�ϴ�! �˸��̸� �ϳ� �� ������ �� �ֽ��ϴ�.");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("�� �̻� �˸��̰� �����ϴ�.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldState());
		}
		
	}

}
