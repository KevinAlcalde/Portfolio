/*
 1.	Responda:
a.	¿De qué tipo es el dato que se obtiene utilizando la función random()?
DOUBLE
b.	Al mostrar en pantalla una matriz, ¿cuál es el dato que se observa para pasar el cursor al renglón siguiente?
EL VALOR DE LA ULTIMA COMLUMNA 
c.	La propiedad length tiene varias formas de uso ¿cuáles son? Cite ejemplos

d.	Utilizando la propiedad length de una matriz cuadrada de dimensión impar, determine lo siguiente: (no puede utilizar números directos)
i.	El centro: [(int)/ (a.length/2)][(int)(a.length/2]
ii.	El elemento de la esquina inferior derecha:[a.length-1][a.length-1]
iii.	El elemento de la esquina superior izquierda:  [a.length-a.length][a.length-a.length]     
iv.	El 2do elemento de la penúltima fila.[a.length-2][a.length-a.length+1]

2.	Resuelva las siguientes consignas:
a)	Teniendo en memoria las letras ‘s’, ‘o’ y ‘l’ guardadas en variables tipo char, únalas formando el String sol, luego, conviértala a mayúscula y obtenga su longitud que deberá resultar 3. Guárdelo en una variable int.
b)	Ahora realice lo mismo que en el punto a) pero todo en una sola sentencia.
c)	Teniendo un número de tres cifras, obtenga su raíz cuadrada, y utilice ese resultado como un código ASCII para generar un carácter, el cual se guardará en una variable de tipo char.
d)	Ahora realice lo mismo que en el punto c) pero todo en una sola sentencia.
e)	Teniendo en memoria el String “murciélago”, haga que se vuelva a guardar en la misma variable, conteniendo las mismas letras pero 3 en mayúscula y 3 en minúscula, y así sucesivamente hasta el final.
f)	Ahora realice lo mismo que en el punto e) pero todo en una sola sentencia.



 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class control2 {
	  public static void main(String[] args) {

	/*	
		char[][] frase = new char[3][3];
                 String palabras = JOptionPane.showInputDialog(null, "Ingrese frase");
              
		
		for (int x = 0; x < frase.length;x++) {
			for (int y = 0; y < frase[x].length; y++) {
			palabras 
				
			}   
		}

		for (int x = 0; x < frase.length;x++) {
			for (int y = 0; y < frase[x].length; y++) {
				 System.out.print("["+frase[x][y]+"]");
			}
			System.out.println("\n");
		}		
		System.out.println("Número de fila: "+frase.length);
		System.out.println("Número de columnas: "+frase[0].length);  

              }*/

         char a ='s';
         char b ='o';
         char c ='l';
             
            String  palabra;
              palabra = (char)(a+b+c);
              System.out.println("la palabra formada es "+ palabra);
         
          
          
          
          
          }
          }  

