#include "ejercicios.h"


int dobleDeEntero(int numero){

	int doble = 2 * numero;

	return doble;
}


bool sinIguales(int numero1, int numero2){
	if(numero1==numero2){
		return true;
	}
	else{
		return false;
	}
}


int tripleDeEntero(int numero){
	numero=numero*3;
	return numero;
}


int sumaDeDosEnteros(int numero1, int numero2){
	int suma;
	suma=numero1+numero2;
	return suma;
}

bool esPar(int numero){
	if(numero%2==0){
		return true;
	}
	else{
		return false;
	}
}


bool esImpar(int numero){
	if(numero%2!=0){
		return true;
	}
	else{
		return false;
	}
}


bool esMultiploDeOcho(int numero){
	if(numero%8==0){
		return true;
	}
	else{
		return false;
	}
}


int cantidadDeElementos(vector<int> unVector){
	int largoVector;
	largoVector=unVector.size();
	return largoVector;
}


int sumaDeElementos(vector<int> unVector){
	int suma=0;
	for(int i=0;i<unVector.size();i++){
		suma=suma+unVector[i];
	}
	return suma;
}


int promedioDeElementos(vector<int> unVector){
	int promedio=0;
	for(int i=0;i<unVector.size();i++){
		promedio=promedio+unVector[i];
	}
	promedio=promedio/unVector.size();
	return promedio;
}


vector<int> triplicoElementos(vector<int> unVector){
	vector<int> vectorTriple;
	for(int i=0;i<unVector.size();i++){
		vectorTriple.push_back(unVector[i]*3);
	}
	return vectorTriple;
}


int elMenorElemento(vector<int> unVector){
	int menorElemento=unVector[0];
	for(int i=1;i<unVector.size();i++){
		if(menorElemento>unVector[i]){
			menorElemento=unVector[i];
		}
	}
	return menorElemento;
}


int elMayorElemento(vector<int> unVector){
	int mayorElemento=unVector[0];
	for(int i=1;i<unVector.size();i++){
		if(mayorElemento<unVector[i]){
			mayorElemento=unVector[i];
		}
	}
	return mayorElemento;
}


vector<int> elementosConIndicePar(vector<int> unVector){
	vector<int> elementosPar;
	for(int i=0;i<unVector.size();i++){
		if(unVector[i]%2==0){
			elementosPar.push_back(unVector[i]);
		}
	}
	return elementosPar;
}


vector<int> elementosConIndiceImpar(vector<int> unVector){
	vector<int> elementosImpar;
	for(int i=0;i<unVector.size();i++){
		if(unVector[i]%2!=0){
			elementosImpar.push_back(unVector[i]);
		}
	}
	return elementosImpar;
}


vector<int> elementosMayoresQue8(vector<int> unVector){
	vector<int> Mayor8;
	for(int i=0;i<unVector.size();i++){
		if(unVector[i]>8){
			Mayor8.push_back(unVector[i]);
		}
	}
	return Mayor8;
}


vector<int> elementosMayoresQueNumero(vector<int> unVector, int numero){
	vector<int> MayorNumero;
	for(int i=0;i<unVector.size();i++){
		if(unVector[i]>numero){
			MayorNumero.push_back(unVector[i]);
		}
	}
	return MayorNumero;
}


bool todosSusElementosSonIguales(vector<int> unVector){
	for(int i=1;i<unVector.size();i++){
		if(unVector[i]!=unVector[i-1]){
			return false;
		}
	}
	return true;
}

bool sonVectoresIguales(vector<int> vectorUno, vector<int> vectorDos){
	if(vectorUno.size() == vectorDos.size()){
		for(int i=0;i<vectorUno.size();i++){
			if(vectorUno[i]!=vectorDos[i]){
				return false;
			}

		}
		return true;
	}
	return false;
}


bool tieneDosElementosPares(vector<int> unVector){
	int contador=0;
	for(int i=0;i<unVector.size();i++){
		if(unVector[i]%2==0){
			contador++;
		}
	}
	if(contador==2){
		return true;
	}
	else{
		return false;
	}
}


int sumaDeLosDosElementosMasChicos(vector<int> unVector){
	int suma;
	int numeroChico1=unVector[0];
	int numeroChico2=unVector[1];
	int posicionNumeroChico1=0;
	for(int i=2;i<unVector.size();i++){
		if(numeroChico1>unVector[i]){
			numeroChico1=unVector[i];
			posicionNumeroChico1=i;
		}
	}
	for(int i=1;i<unVector.size();i++){
		if(i!=posicionNumeroChico1){
			if(numeroChico2>unVector[i]){
				numeroChico2=unVector[i];
			}
		}
	}
	suma=numeroChico1+numeroChico2;
	return suma;
}


vector<vector<int> > llenarDeCeros(vector<vector<int> > unaMatriz){
	for(int i=0;i<unaMatriz.size();i++){
		for(int j=0;j<unaMatriz[i].size();j++){
			unaMatriz[i][j]=0;
		}
	}
	return unaMatriz;
}


void mostrarVector(vector<int> unVector){
	for(int i=0;i<unVector.size();i++){
		cout<<unVector[i]<<" ";
	}
	cout<<endl;
}



