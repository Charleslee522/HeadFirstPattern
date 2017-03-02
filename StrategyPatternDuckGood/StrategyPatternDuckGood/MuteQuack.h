#pragma once
#include "QuackBehavior.h"
namespace duck {

class MuteQuack : public QuackBehavior
{
public:
	MuteQuack(void);
	virtual ~MuteQuack(void);

	virtual void quack(void);
};

}
