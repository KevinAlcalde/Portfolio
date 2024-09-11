/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class mediaDeLaclase {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int nroAlumnos,i;
 double suma = 0, media;
  //Lectura del numero de alumnos.Debe ser un valor positivo
 do{
 System.out.println("Numero de alumnos de la clase: ");
  nroAlumnos = sc.nextInt();
 }while(nroAlumnos<=0);
  //Se crea un array llamado notas de de nroAlumnos elementos de tipo double
  double[]notas = new double[nroAlumnos];
  //Entrada de datos.Se lee la nota de cada alumno y se guarda en cada elemento del array
        for ( i = 0; i < notas.length; i++) {
            System.out.println("(Alumno"+(i+1)+"Nota final:"); 
            notas[i]=sc.nextDouble();
        }
       //sumar todas las notas
        for ( i = 0; i < notas.length; i++) {
            suma=suma+notas[i];
        }
          //calcular la media
          media=suma/notas.length;
          //mostrar la media
          System.out.printf("la nota media del curso es %.2f%n",media);
          //mostrar los valores superiores a la media
          System.out.println("Listado de notas superiores a la media:");
          for (i = 0;  i< notas.length; i++) {
              if(notas[i]>media){
                  System.out.println(" Alumno numero"+(i+1)+"Nota final: "+ notas[i]);
              }
            
        }
        }
}
