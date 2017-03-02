#include "ForecastDisplay.h"
#include <iostream>

using namespace std;

ForecastDisplay::ForecastDisplay(Subject * weatherData) : weatherData_(weatherData)
{
	weatherData_->registerObserver(this);
}

ForecastDisplay::~ForecastDisplay(void)
{
}

void ForecastDisplay::update( float temp, float humidity, float pressure )
{
	display();
}

void ForecastDisplay::display()
{
	cout << "Forecast Display!!!" << endl;
}
