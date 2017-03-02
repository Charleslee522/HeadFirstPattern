#include "MuteQuack.h"
#include <iostream>

using namespace duck;
using namespace std;

MuteQuack::MuteQuack(void) : QuackBehavior()
{
}


MuteQuack::~MuteQuack(void)
{
}

void duck::MuteQuack::quack(void)
{
	cout << "Quack Quack Quack !!!" << endl;
}

