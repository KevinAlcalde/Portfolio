#include <stdio.h>
#include<stdlib.h>
#include<conio.h>
int main() {
	int i=0,cont1=0,cont2=0,cont3=0,j=0; 
	char a[25],b[25],c[50];
	char *pa,*pb,*pc;
	pa=a;
	pb=b;
	pc=c;
	printf("ingrese la primer cadena de caracteres a concaternar\n");
	gets(a);
	printf("Ingrese la segunda cadena de caracteres a concatenar\n");
	gets(b);
	if(cont1==cont2)
	{
		for(i=0;i<cont1;i++)
		{
			if(pa[i]==pb[i])
			{
				cont3++;
			}
			else
			{
				printf("Las cadenas no son iguales"); 
				i=cont1;
			} 
			if(cont3==cont1)
			{
				printf("Las cadenas son iguales\n");		
			} 
			
		} 
		
	}	 
	else
	{
		printf("Las cadenas no son iguales"); 
	}
	while(pa[i]!='\0')
	{
		pc[i]=pa[i];
		i++;
	}
	i++;
	while(pb[j]!='\0')
	{
		pc[i+j]=pb[j];
		j++;
	}
	pc[i+j]='\0';
	printf("Las cadenas concatenadas son: %s\n",pc); 
	return 0;
}

