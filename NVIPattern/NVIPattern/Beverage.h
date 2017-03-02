#pragma once
#include <iostream>

class Beverage
{
public:
	Beverage(void);
	~Beverage(void);
	void prepareRecipe();
	void boilWater();
	void brew();
	void add();
	void pourInCup();

private:
	virtual void doBrew() = 0;
	virtual void doAdd() = 0;
	virtual bool checkResourceQuality() = 0;
};

