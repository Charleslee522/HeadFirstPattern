#pragma once
#include "FlyBehavior.h"

namespace duck {

class FlyNoWay : public FlyBehavior
{
public:
	FlyNoWay(void);
	virtual ~FlyNoWay(void);

	virtual void fly();
};

}

