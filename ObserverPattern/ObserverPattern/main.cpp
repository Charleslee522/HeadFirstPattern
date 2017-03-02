#include "Observer.h"
#include "CurrentConditions.h"
#include "ForecastDisplay.h"
#include "StatisticsDisplay.h"
#include "WeatherData.h"
#include "Subject.h"

int main(void) {

	WeatherData * weatherData = new WeatherData();

	Observer * currentConditions = new CurrentConditions(weatherData);
	Observer * forecastDisplay = new ForecastDisplay(weatherData);
	Observer * statisticsDisplay = new StatisticsDisplay(weatherData);

	weatherData->setMeasurements(80, 65, 31.4f);
	weatherData->setMeasurements(82, 70, 29.2f);
	weatherData->setMeasurements(78, 90, 29.2f);

	return 0;
}