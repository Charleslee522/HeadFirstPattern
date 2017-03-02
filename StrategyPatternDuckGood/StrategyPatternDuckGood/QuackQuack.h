#pragma once
#include "QuackBehavior.h"
namespace duck {

class QuackQuack : public QuackBehavior
{
public:
	QuackQuack(void);
	virtual ~QuackQuack(void);

	virtual void quack(void);
};

}
