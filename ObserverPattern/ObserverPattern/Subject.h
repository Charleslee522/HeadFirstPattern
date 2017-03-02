#pragma once

class Observer;

class Subject
{
public:
	Subject(void);
	~Subject(void);

	virtual void registerObserver(Observer * observer) = 0;
	virtual void removeObserver(Observer * observer) = 0;
	virtual void notifyObservers() = 0;
};

