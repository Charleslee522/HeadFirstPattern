#include "Beverage.h"


Beverage::Beverage(void) : description_("제목 없음")
{

}


Beverage::~Beverage(void)
{
}

std::string Beverage::getDescription()
{
	return description_;
}

double Beverage::cost()
{

}
