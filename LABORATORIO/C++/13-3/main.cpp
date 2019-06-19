#include "ejercicios.h"

/*

 Comando para producir el ejecutable:

 g++ -o nombreDeEjecutable ejercicios.h ejercicios.cpp main.cpp


 Comando para ejecutarlo:

 ./nombreDelEjecutable


*/


int main(void){
	printf("TEST elMenorElemento. Caso con 2 como elemento menor.");
	vector<int> vectorElementos = {4,6,5,2};
   int valorEsperado = 2;
   int valorObtenido = elMenorElemento(vectorElementos);
   if(valorEsperado==valorObtenido){printf("Pasó el test\n");}else{printf("No pasó el test\n");};

	printf("TEST elMenorElemento. Caso con 4 como elemento menor.");
	vectorElementos.pop_back();
   valorEsperado = 4;
   valorObtenido = elMenorElemento(vectorElementos);
   if(valorEsperado==valorObtenido){printf("Pasó el test\n");}else{printf("No pasó el test\n");};   

   printf("TEST tieneDosElementosPares. Caso con 2 elementos pares.");
	vector<int> vectorPares = {3,5,6,8};
   bool valorEsp = true;
   bool valorObt = tieneDosElementosPares(vectorPares);
   if(valorEsp==valorObt){printf("Pasó el test\n");}else{printf("No pasó el test\n");};

	printf("TEST sumaDeLosDosElementosMasChicos. Caso con suma entre 1 y 3.");
	vector<int> vectorSuma ={5,1,7,4,3};
   valorEsperado = 4;
   valorObtenido = sumaDeLosDosElementosMasChicos(vectorSuma);
   if(valorEsperado==valorObtenido){printf("Pasó el test\n");}else{printf("No pasó el test\n");};

   printf("TEST sumaDeLosDosElementosMasChicos. Caso con suma entre 1 y 4.");
	vectorSuma.pop_back();
   valorEsperado = 5;
   valorObtenido = sumaDeLosDosElementosMasChicos(vectorSuma);
   if(valorEsp==valorObt){printf("Pasó el test\n");}else{printf("No pasó el test\n");};

   printf("TEST mostrarVector. Caso con vector con 2 elementos.");
	vector<int> vectorMostrar = {3,5};
   printf("\n");
   mostrarVector(vectorMostrar);


   printf("TEST mostrarVector. Caso con vector vacio.");
   vectorMostrar.pop_back();
   vectorMostrar.pop_back();
   printf("\n");
   mostrarVector(vectorMostrar);
}

