#pragma once
#include "FlyBehavior.h"
#include "QuackBehavior.h"

namespace duck{

class Duck
{
public:
	Duck(void);
	
	void performQuack(void);
	void performFly(void);
	void swim(void);
	void display(void);
	void setFlyBehavior(FlyBehavior * flyBehavior);

	virtual ~Duck(void);

protected:
	FlyBehavior * flyBehavior_;
	QuackBehavior * quackBehavior_;
};

}