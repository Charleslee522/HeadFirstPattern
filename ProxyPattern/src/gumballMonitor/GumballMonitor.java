package gumballMonitor;

import java.rmi.RemoteException;

import stateMachine.GumballMachineRemote;

public class GumballMonitor {
	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report() {
		try{
			System.out.println("�̱� ��� ��ġ: " + machine.getLocation());
			System.out.println("���� ���: " + machine.getCount() + " ��");
			System.out.println("���� ����: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
