#include "Beverage.h"

using namespace std;

Beverage::Beverage(void)
{
}

void Beverage::prepareRecipe() {
	boilWater();
	brew();
	pourInCup();
	add();
}

Beverage::~Beverage(void)
{
}

void Beverage::boilWater()
{
	cout << "Boiling Water\n";
}

void Beverage::pourInCup()
{
	cout << "Pouring into cup\n";
}

void Beverage::add()
{
	doAdd();
}

void Beverage::brew()
{
	if(checkResourceQuality()) {
		doBrew();
	}
}
