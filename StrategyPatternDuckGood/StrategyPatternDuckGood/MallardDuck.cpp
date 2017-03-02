#include "MallardDuck.h"
#include "FlyWithWings.h"
#include "QuackQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

MallardDuck::MallardDuck(void)
{
	cout << "--------------------------------------MallardDuck!!-------------------------------" << endl;
	flyBehavior_ = new FlyWithWings();
	quackBehavior_ = new QuackQuack();
}

MallardDuck::~MallardDuck(void)
{
}
