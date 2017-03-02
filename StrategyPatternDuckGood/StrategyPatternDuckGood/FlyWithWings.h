#pragma once
#include "FlyBehavior.h"

namespace duck {

class FlyWithWings : public FlyBehavior
{
public:
	FlyWithWings(void);
	virtual ~FlyWithWings(void);

	virtual void fly();
};

}

