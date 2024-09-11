#include <stdio.h>
#include<stdlib.h>
#include <string.h>
#include <conio.h>
int main() 
{
	char marca[10][50]={{'-','f','i','a','t'},{'-','f','o','r','d'},{'-','a','u','d','i'},{'-','p','o','r','s','c','h','e'},{'-','G','M','C'}};
    char modelo[10][50]={{'-','6','0','0'},{'-','f','1','5','0'},{'-','a','8'},{'-','9','1','1','s'},{'-','s','i','e','r','r','a'}};
    char serie[10][50]={{'-','1','4','8','9','-'},{'-','1','2','0','0','0','-'},{'-','4','2','0','0','4','-'},{'-','4','4','9','l','-'},{'-','1','2','6','5','-'}};
    char registro[100][50],a[20]="",b[20]="",c[20]="";
    char barra[10]="";
    int i,j,n=5,z=1,o,t,q=0,k,r=0;
	printf("\nComprobacion de Registro Existente:\n\n");
	for(i=0;i<n;i++)
    {
             strcat(registro[i],marca[i]);
             strcat(registro[i],modelo[i]);
             strcat(registro[i],serie[i]);
    }        
    do{
             system("cls");
             for(i=0;i<n;i++)
             {
                      puts(registro[i]);
                      fflush(stdin);
             }
             printf("\n\nDesea buscar por:\n\n1-Marca.\n\n2-Modelo.\n\n3-NSerie.\n\n4-Ingresar Informacion(Max. 10 Registros).\n\n5-Salir.\n\n");
             scanf("%d",&o);
             switch(o)
             {
                      case 1: printf("\n\nIngrese la Marca a buscar: \n\n");
                              fflush(stdin);
                              gets(a);
                              t=strlen(a); 
                             j=strcmp(registro[i],a);
							 if(j>0){
								 
                                              printf("\n\nRegistro Encontrado: ");
                                              puts(registro[r]);
                                              printf("\n\n");
                                              fflush(stdin);                              
                              }
							 else{
								 printf("\n\nRegistro NO Encontrado: "); 
							 };break;
                      case 2: printf("\n\nIngrese el Modelo a buscar: \n\n");
                              fflush(stdin);
                              gets(b); 
                              t=strlen(b); 
                              q=0;
                              for(k=0;k<n;k++)
                              {
                                              i=0;
                                              for(j=0;j<50;j++)
                                              {
                                                        if(b[i]==registro[k][j])
                                                        {          
                                                                     q++;
                                                                     i++;
                                                        }
                                                        if(q==t) 
                                                        {
                                                                     r=k;
                                                        }
                                              }
                              }
                              if(q=t) 
                              {
                                              printf("\n\nRegistro Encontrado: ");
                                              puts(registro[r]);
                                              printf("\n\n");
                                              fflush(stdin);                              
                              }else{
				  printf("\n\nNo se encontro el Modelo:\n "); 
				 puts(b); 
			 };break;
                      case 3: printf("\n\nIngrese el NSerie a buscar: \n\n");
                              fflush(stdin);
                              gets(c); 
                              t=strlen(c); 
                              q=0;
                              for(k=0;k<n;k++)
                              {
                                              i=0;
                                              for(j=0;j<50;j++)
                                              {
                                                        if(c[i]==registro[k][j])
                                                        {          
                                                                     q++;
                                                                     i++;
                                                        }
                                                        if(q==t) 
                                                        {
                                                                     r=k;
                                                        }
                                              }
                              }
                              if(q==t) 
                              {
                                              printf("\n\nRegistro Encontrado: ");
                                              puts(registro[r]);
                                              printf("\n\n");
                                              fflush(stdin); 
                              }else{
								  printf("\n\nNo se encontro el N° de Serie:\n "); 
								  puts(c); 
							  }
							  ;break;
                      case 4: printf("\n\nIngrese Marca nueva al registro: ");
                              fflush(stdin);
                              gets(marca[n]);
                              printf("\n\nIngrese Modelo nuevo al registro: ");
                              fflush(stdin);
                              gets(modelo[n]);
                              printf("\n\nIngrese NSerie nuevo al registro: ");
                              fflush(stdin);
                              gets(serie[n]);
                              barra[0]='-';
                              strcat(registro[n],barra);
                              strcat(registro[n],marca[n]);
                              strcat(registro[n],barra);
                              strcat(registro[n],modelo[n]);
                              strcat(registro[n],barra);
                              strcat(registro[n],serie[n]);
                              strcat(registro[n],barra);
                              n++;
                               ;break;
                      default: printf("\nEXIT\n"); ;break;
             }
             printf("\n\nDesea Reiniciar el programa S=0/N=1\n\n");
             scanf("%d",&z);
    }while(z!=1);
    getch();
}
