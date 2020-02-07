#include <iostream>
#include "complex.h" ;
#include<conio.h>;
using namespace std;

typedef int carnet;
string nombre;

#include "Nodo.h"

#pragma once
class Lista
{
protected:
	Nodo* primero;
public:
	Lista() {
		primero = NULL;
	}
	void crearLista();
	void insertarInicio(int carnet, string nombre);
	void visualizar();
	Nodo* buscar(int posicion);
	void eliminar(Nodo* n);

};
void Lista::crearLista(){
	int x;
	string c;
	cout << "Termina con -1 " << endl;
	do{
		cin >> x;
		cin >> c;
		if (x != -1){}
		{
			primero = new Nodo(x, c, primero);
		}
	} while (x != -1);
}

void Lista::insertarInicio(int carnet, string nombre) {
	Nodo* nuevo;
	nuevo = new Nodo(carnet, nombre);
	nuevo->ponerEnlace(primero); //enlaza nuevo con primero
	primero = nuevo; //mueve primero y apunta al nuevo nodo
}

void Lista::visualizar() {
	Nodo* n = primero;
	char c;
	std::cout << "-----------------------------------------\n";
	std::cout << "El ultimo carnet ingresado esta hasta arriba \n";
	while (n != NULL)
	{
		std::cout << "carnet:" << n->carnetNodo() << " - "<< n->nombreNodo() << "\n";
		n = n->enlaceNodo();
	}
	std::cout << "-----------------------------------------\n";
}

Nodo* Lista::buscar(int posicion) {
	Nodo* indice;
	int i;
	if (0 >= posicion)
		return NULL;
	indice = primero;
	for (i = 1; (i < posicion) && (indice != NULL); i++) {
		indice = indice->enlaceNodo();
	}
	if( indice)
		std::cout << "el nodo con posicion:" << posicion << "es " << "carnet:" << indice->carnetNodo() << " - " << indice->nombreNodo() << "\n";
	else
		std::cout << "el nodo con la posicion" << posicion << "no se encontro";
	return indice;
}
void Lista::eliminar(Nodo * n)
{
	Nodo* actual, * anterior;
	bool encontrado;
	actual = primero;
	anterior = NULL;
	encontrado = false;
	std::cout << "borrando  \n";
	// búsqueda del nodo y del anterior
	while ((actual != NULL) && !encontrado)
	{
		encontrado = (actual->enlaceNodo() == n);
		if (!encontrado)
		{
			anterior = actual;
			actual = actual->enlaceNodo();
		}
	}
	// enlace del nodo anterior con el siguiente
	if (actual != NULL)
	{
		// distingue entre cabecera y resto de la lista
		if (actual == primero)
		{
			primero = actual->enlaceNodo();
		}
		else
		{
			anterior->ponerEnlace(actual->enlaceNodo());
		}
		delete actual;
	}
}

