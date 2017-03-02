package beverage;

public class Coffee extends Beverage
{
	@Override
	protected void add() {
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	protected void brew() {
		System.out.println("Dripping Coffee through filter");
	}

}