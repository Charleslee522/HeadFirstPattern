#include "DecoyDuck.h"
#include "FlyNoWay.h"
#include "MuteQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

DecoyDuck::DecoyDuck(void)
{
	cout << "--------------------------------------DecoyDuck!!-------------------------------" << endl;
	flyBehavior_ = new FlyNoWay();
	quackBehavior_ = new MuteQuack();
}

DecoyDuck::~DecoyDuck(void)
{
}
