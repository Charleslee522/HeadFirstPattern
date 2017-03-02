#pragma once
#include "Observer.h"
#include "DisplayElement.h"

class ThirdPartyDisplay : public Observer, DisplayElement
{
public:
	ThirdPartyDisplay(void);
	~ThirdPartyDisplay(void);

	virtual void update( float temp, float humidity, float pressure );

	virtual void display();

};

