#include "RedHeadDuck.h"
#include "FlyWithWings.h"
#include "QuackQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

RedHeadDuck::RedHeadDuck(void)
{
	cout << "--------------------------------------RedHeadDuck!!-------------------------------" << endl;

	flyBehavior_ = new FlyWithWings();
	quackBehavior_ = new QuackQuack();
}

RedHeadDuck::~RedHeadDuck(void)
{
}
