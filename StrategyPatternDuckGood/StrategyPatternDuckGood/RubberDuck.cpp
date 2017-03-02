#include "RubberDuck.h"
#include "FlyNoWay.h"
#include "MuteQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

RubberDuck::RubberDuck(void)
{
	cout << "--------------------------------------RubberDuck!!-------------------------------" << endl;
	flyBehavior_ = new FlyNoWay();
	quackBehavior_ = new MuteQuack();
}

RubberDuck::~RubberDuck(void)
{
}
