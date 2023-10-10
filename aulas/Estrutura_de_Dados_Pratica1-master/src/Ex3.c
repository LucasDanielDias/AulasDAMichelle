#include <stdio.h>

void soma (int val1, int val2, int *resultado){
	*resultado = val1+val2;
}
	 
int main(){
	int val1=10, val2=20;
	int resultado;
	
	soma(val1, val2, &resultado);
	printf("Resultado: %d", resultado);
	
return  0;
}
