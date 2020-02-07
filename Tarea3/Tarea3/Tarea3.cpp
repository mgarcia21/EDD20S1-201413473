// Tarea3.cpp : Este archivo contiene la función "main". La ejecución del programa comienza y termina ahí.
//

#include <iostream>
#include "complex.h";
#include<conio.h>;
#include "Lista.h"

int main()
{

    Lista* list1 = new Lista();
    list1->insertarInicio(201413473,"Maynor Rolando Garcia Castro");
    list1->insertarInicio(201420455, "juan perez");
    list1->visualizar();
    list1->buscar(2);
    list1->buscar(4);
    Nodo* nodo = new Nodo(201413473, "Maynor Rolando Garcia Castro");
    list1->eliminar(nodo);
    list1->visualizar();
    return -1;

}

// Ejecutar programa: Ctrl + F5 o menú Depurar > Iniciar sin depurar
// Depurar programa: F5 o menú Depurar > Iniciar depuración

// Sugerencias para primeros pasos: 1. Use la ventana del Explorador de soluciones para agregar y administrar archivos
//   2. Use la ventana de Team Explorer para conectar con el control de código fuente
//   3. Use la ventana de salida para ver la salida de compilación y otros mensajes
//   4. Use la ventana Lista de errores para ver los errores
//   5. Vaya a Proyecto > Agregar nuevo elemento para crear nuevos archivos de código, o a Proyecto > Agregar elemento existente para agregar archivos de código existentes al proyecto
//   6. En el futuro, para volver a abrir este proyecto, vaya a Archivo > Abrir > Proyecto y seleccione el archivo .sln
