#pragma once
#include <iostream>
#include "complex.h" ;
#include<conio.h>;
using namespace std;

#ifndef _NODO_H
#define _NODO_H
class Nodo
{
protected:
	int carnet;
	string nombre;
	Nodo* enlace;
public:
	Nodo(int c, string n) {
		carnet = c;
		nombre = n;
		enlace = 0;
	}
	Nodo(int c, string no, Nodo* n) {
		carnet = c;
		nombre = no;
		enlace = n;
	}
	int carnetNodo() const {
		return carnet;
	}
	string nombreNodo() const {
		return nombre;
	}
	Nodo* enlaceNodo() const {
		return enlace;
	}
	void ponerEnlace(Nodo* siguiente) {
		enlace = siguiente;
	}
};
#endif // !_NODO_H

