#pragma once

class Beverage;

class Tea : public Beverage
{
public:
	Tea(void) {}
	virtual ~Tea(void) {}

	void doBrew();
	void doAdd();
	bool checkResourceQuality();
};
