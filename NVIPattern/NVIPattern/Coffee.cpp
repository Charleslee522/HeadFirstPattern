#include "Beverage.h"
#include "Coffee.h"

using namespace std;

void Coffee::doBrew() {
	cout << "Dripping Coffee through filter\n";
}

void Coffee::doAdd() {
	cout << "Adding Sugar and Milk\n";
}

bool Coffee::checkResourceQuality() {
	cout << "Check Coffee Quality!\n";
	return true;
}