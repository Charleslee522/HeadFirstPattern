package testDrive;

import stateMachine.GumballMachine;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertsQuarter();
		gumballMachine.ejectsQuarter();
		gumballMachine.turnsCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		gumballMachine.ejectsQuarter();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertsQuarter();
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		gumballMachine.insertsQuarter();
		gumballMachine.turnsCrank();
		
		System.out.println(gumballMachine);
		
		
	}

}
