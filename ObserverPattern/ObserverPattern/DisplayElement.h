#pragma once
class DisplayElement
{
public:
	DisplayElement(void);
	~DisplayElement(void);

	virtual void display() = 0;
};

