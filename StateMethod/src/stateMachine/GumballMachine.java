package stateMachine;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int coinCount = 0;

	public GumballMachine(int count) {
		this.coinCount = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}

	public void insertsQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
			System.out.println("Please wait, we're already giving you a gumball");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		}
	}

	public void turnsCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball!!");
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		} else if(state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		} else if(state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();
		}
	}

	public void ejectsQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already terned the crank");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	}

	void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			--coinCount;
			if(coinCount == 0) {
				System.out.println("Opps, out of gumballs!");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
		} else if(state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if(state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if(state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}
	public String toString() {
		String str = "\nMighty Gumball, Inc.\n" + 
				"Java-enabled Standing Gumball Model #2004\n" +
				"Inventory: " + coinCount + " gumballs\n";
		if(coinCount > 0) {
			 str += "Machine is waiting for quarter\n";
		} else {
			str += "Machine is sold out\n";
		}
		return str;
		
	}
}

// other methods here like toString() and refill()
