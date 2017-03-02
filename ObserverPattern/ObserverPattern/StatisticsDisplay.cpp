#include "StatisticsDisplay.h"
#include <iostream>

using namespace std;

StatisticsDisplay::StatisticsDisplay(Subject * weatherData) : weatherData_(weatherData)
{
	weatherData_->registerObserver(this);
}


StatisticsDisplay::~StatisticsDisplay(void)
{
}

void StatisticsDisplay::update( float temp, float humidity, float pressure )
{
	display();
}

void StatisticsDisplay::display()
{
	cout << "Statistic Display!!!" << endl;
}
