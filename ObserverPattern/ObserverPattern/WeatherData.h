
#pragma once
#include "Subject.h"
#include "Observer.h"
#include <vector>

class WeatherData : public Subject
{
public:
	WeatherData(void);
	~WeatherData(void);

	virtual void registerObserver(Observer * observer);

	virtual void removeObserver(Observer * observer);

	virtual void notifyObservers();

	void measurementsModified();

	void setMeasurements(float temp, float humidity, float pressure);

private:
	std::vector<Observer *> observerList_;
	float temp_;
	float humidity_;
	float pressure_;

};

