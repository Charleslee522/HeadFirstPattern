#include "Duck.h"
#include <iostream>
#include "FlyWithWings.h"
#include "QuackQuack.h"

using namespace std;
using namespace duck;

Duck::Duck(void)
{
	cout << "--------------------------------------Duck!!-------------------------------" << endl;
	quackBehavior_ = new QuackQuack();
	flyBehavior_ = new FlyWithWings();
}


Duck::~Duck(void)
{
}

void Duck::performQuack( void )
{
	quackBehavior_->quack();
}

void Duck::performFly(void)
{
	flyBehavior_->fly();
}

void Duck::swim( void )
{
	cout << "Swim~~.~ lalala~!" << endl;
}

void Duck::display( void )
{
	performQuack();
	performFly();
	swim();
}
