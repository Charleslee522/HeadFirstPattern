package stateMachine;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import state.HasQuarterState;
import state.NoQuarterState;
import state.SoldOutState;
import state.SoldState;
import state.State;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7266900558403196650L;
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;
	String location;

	public GumballMachine(String location, int numberGumballs) throws RemoteException{
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
		this.location = location;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectsQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	void dispense() {}

	public String toString() {
		String str = "\nMighty Gumball, Inc.\n" + "Java-enabled Standing Gumball Model #2004\n" + "Inventory: " + count + " gumballs\n";
		if (count > 0) {
			str += "Machine is waiting for quarter\n";
		} else {
			str += "Machine is sold out\n";
		}
		return str;

	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public int getCount() {
		return count;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void releaseBall() {
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public String getLocation() throws RemoteException {
		return location;
	}

	public State getState() throws RemoteException {
		return state;
	}

}

// other methods here like toString() and refill()
