#pragma once

#include <iostream>

using namespace std;

class Beverage
{
public:
	Beverage(void);
	
	string getDescription();

	virtual double cost();

	~Beverage(void);

private:
	string description_;
};

