#pragma once

class Beverage;

class Coffee : public Beverage
{
public:
	Coffee(void) {}
	virtual ~Coffee(void) {}

	void doBrew();
	void doAdd();
	bool checkResourceQuality();
};
