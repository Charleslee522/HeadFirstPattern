#include "QuackQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

QuackQuack::QuackQuack(void) : QuackBehavior()
{
}


QuackQuack::~QuackQuack(void)
{
}

void duck::QuackQuack::quack(void)
{
	cout << "Quack Quack Quack !!!" << endl;
}

