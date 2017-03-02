#include "WeatherData.h"
#include <iostream>
#include <algorithm>

using namespace std;

WeatherData::WeatherData(void)
{
}


WeatherData::~WeatherData(void)
{
}

void WeatherData::registerObserver( Observer * observer )
{
	observerList_.push_back(observer);
}

void WeatherData::removeObserver( Observer * observer )
{
	std::remove(observerList_.begin(), observerList_.end(), observer);
}

void WeatherData::notifyObservers()
{
	for(vector<Observer *>::iterator i = observerList_.begin(); i != observerList_.end(); ++i) {
		(*i)->update(temp_, humidity_, pressure_);;
	}
}

void WeatherData::measurementsModified()
{
	notifyObservers();
}

void WeatherData::setMeasurements( float temp, float humidity, float pressure )
{
	temp_ = temp;
	humidity_ = humidity;
	pressure_ = pressure;
	measurementsModified();
}
