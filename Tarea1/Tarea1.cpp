// holaMundo.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include "complex.h";
#include<conio.h>;
using namespace std;
int main()
{
	char matriz[1000][1000];
	int filas, columnas;
	cout << "ingresar numero de filas: ";
	cin >> filas;
	cout << "ingresar numero de columnas: ";
	cin >> columnas;
	for (int i = 0; i < filas; i++)
	{
		for (int j = 0; j < columnas; j++)
		{
			if (i == 0 || i == filas - 1) {
				matriz[i][j] = '1';
			}
			else if (j == 0 || j == columnas - 1) {
				matriz[i][j] = '1';
			}
			else {
				matriz[i][j] = '0';

			}


		}
	}

	//mostrando matriz
	for (int i = 0; i < filas; i++)
	{
		for (int j = 0; j < columnas; j++)
		{
			cout << matriz[i][j];
		}
		cout << "\n";
	}





}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
