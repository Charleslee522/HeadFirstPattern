#pragma once
#include "Observer.h"
#include "DisplayElement.h"
#include "Subject.h"

class CurrentConditions : public Observer, DisplayElement
{
public:
	CurrentConditions(Subject * weatherData);
	~CurrentConditions(void);

	virtual void update( float temp, float humidity, float pressure );

	virtual void display();

private:

	float temp_;
	float humidity_;
	Subject * weatherData_;

};

