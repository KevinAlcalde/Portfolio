/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class primerejerciciomodulo2 {
     static float prom=0;
    static int acum=0;
     public static void main(String args[]){
 float notas[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,}, prom1; //declara arreglo y variable para recibir promedio
        int contador =0, resp;//cuenta notas y numera arreglo
        float nota=-1;
        
        while (contador<9){  //controla 10 elementos del arreglo
            while (nota<0 || nota>10){  //controla valor de la nota
            nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese una nota"));
            if (nota<0 || nota>10) 
            { 
                System.out.println("Incorrecto. Ingrese de 0 a 10"); //aviso de error
            }
            
        }
       notas[contador]=nota; //guarda nota
                       
       prom1 = promedio(nota);  //promedia con notas existentes
            
       if (contador<10){ 
           resp = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otra nota? 1 = SI, 0 = NO"));
           if (resp == 0) //si no hay más notas
           {
               mostrar(notas,prom1); //muestra resultados
               contador = 10;  //cancela el bucle
           }
           else {
               contador++;//aumenta el contador porque hay otra nota
               nota = -1;
           }
       }
    }
    }
    public static void mostrar(float arreglo[],float promedio){
        int i=0;
        while (i<10 && arreglo[i]>-1){
            System.out.println("nota "+i+":"+arreglo[i]); 
            i++;
        }
        System.out.println("Promedio obtenido: "+promedio);
    }
    public static float promedio(float a){
        prom+=a;
        acum++;
        return prom/acum;
        
    }    
}
