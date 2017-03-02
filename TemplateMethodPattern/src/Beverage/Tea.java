package beverage;

public class Tea extends Beverage
{
	@Override
	protected void add() {
		System.out.println("Adding Lemon");
	}

	@Override
	protected void brew() {
		System.out.println("Steeping the tea");
	}

}
