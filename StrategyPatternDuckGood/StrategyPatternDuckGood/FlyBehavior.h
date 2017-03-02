#pragma once
namespace duck{

class FlyBehavior
{
public:
	FlyBehavior(void);
	virtual ~FlyBehavior(void);

	virtual void fly() = 0;
};

}
