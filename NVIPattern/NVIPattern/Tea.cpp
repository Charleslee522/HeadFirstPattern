#include "Beverage.h"
#include "Tea.h"

using namespace std;

void Tea::doBrew() {
	cout << "Steeping the tea\n";
}
void Tea::doAdd() {
	cout << "Adding Lemon\n";
}
bool Tea::checkResourceQuality() {
	cout << "Check Tea Quality!\n";
	return true;
}