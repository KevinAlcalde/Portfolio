/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Cajero {

    /**

     */
    public static void main(String[] args) {
       
        
        
        
        do{
           System.out.println("\tINGRESE OPERACION A REALIAR \n1. Deposito\n2. Extraccion\n3.Consultar saldo disponible\n4. Salir");
	   Scanner sc = new Scanner(System.in);
              int i = sc.nextInt(); 
	   switch(seleccion)
		  
	   {   
		
	   case 1:  
		   printf("\nINGRESE DEPOSITO ");
		   scanf("%i",&D);
		   SI = 1000+D;
		   printf("SU SALDO ES:%i\t", SI);
		   break;
	   case 2:  
		   printf("INGRESE EXTRACCION");
		   scanf("%i",&E);
		   SI = 1000-E;
		   if(SI<0)
		   {
		   printf("no dispone de ese saldo ");
		   } 
	    else {
			   printf("SU SALDO ES%i: \t ", SI);
		   }
		   break;
	   case 3: 
		   printf("SU SALDO ES: %i\t", SI);
		   break;
	   case 4: 
		             System.out.println("gracias por usar el servicio");
		   break;
	 
	   } 	
	}while(seleccion!=4);
}


    }
    
}
