#include "Beverage.h"


Beverage::Beverage(void) : description_("���� ����")
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
