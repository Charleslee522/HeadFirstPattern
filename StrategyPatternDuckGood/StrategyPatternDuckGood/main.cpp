#include "Duck.h"
#include "RubberDuck.h"
#include "MallardDuck.h"
#include "RedHeadDuck.h"
#include "DecoyDuck.h"

using namespace duck;
int main(void) {

	Duck duck = Duck();
	duck.display();
	duck = RubberDuck();
	duck.display();
	duck = MallardDuck();
	duck.display();
	duck = RedHeadDuck();
	duck.display();
	duck = DecoyDuck();
	duck.display();



	return 0;
}
