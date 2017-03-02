#include "CurrentConditions.h"
#include <iostream>

using namespace std;

CurrentConditions::CurrentConditions(Subject * weatherData) : weatherData_(weatherData)
{
	weatherData_->registerObserver(this);
}


CurrentConditions::~CurrentConditions(void)
{
}

void CurrentConditions::update( float temp, float humidity, float pressure )
{
	std::cout << "Update Current Conditions" << std::endl;
	temp_ = temp;
	humidity_ = humidity;
	display();
}

void CurrentConditions::display()
{
	cout << "Current Conditions: " << temp_ << "F degrees and " << humidity_ << "% humidity" << endl;
}
