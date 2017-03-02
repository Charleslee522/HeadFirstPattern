#include "Beverage.h"
#include "Coffee.h"
#include "Tea.h"

int main(void) {

	Beverage * coffee = new Coffee();
	coffee->prepareRecipe();

	Beverage * tea = new Tea();
	tea->prepareRecipe();


	return 0;
}