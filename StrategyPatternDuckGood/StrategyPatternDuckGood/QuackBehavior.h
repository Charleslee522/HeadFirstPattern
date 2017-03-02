#pragma once

namespace duck {

class QuackBehavior
{
public:
	QuackBehavior(void);
	virtual ~QuackBehavior(void);

	virtual void quack(void) = 0;
};

}