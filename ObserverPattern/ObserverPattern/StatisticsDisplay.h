#pragma once
#include "Observer.h"
#include "DisplayElement.h"
#include "Subject.h"

class StatisticsDisplay : public Observer, DisplayElement
{
public:
	StatisticsDisplay(Subject * weatherData);
	~StatisticsDisplay(void);

	virtual void update( float temp, float humidity, float pressure );

	virtual void display();

private:

	float temp_;
	float humidity_;
	Subject * weatherData_;


};

