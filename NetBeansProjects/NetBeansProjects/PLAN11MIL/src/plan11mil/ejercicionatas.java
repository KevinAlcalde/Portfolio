/*
realizar un progrtama que recibe como parametro tres notas y muestra por pantalla  el estado del alumno habiendo calculado previamente el promedio
 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class ejercicionatas {
     public static void main(String[] args) {
   float nota1,nota2,nota3;
     String n1 = JOptionPane.showInputDialog("ingrese nota 1");
     String n2 = JOptionPane.showInputDialog("ingrese nota 2");
     String n3 = JOptionPane.showInputDialog("ingrese nota 3");
     nota1 = (float)Integer.parseInt(n1);
      nota2 = (float)Integer.parseInt(n2);
       nota3 =(float) Integer.parseInt(n3);
       
       diagnostico(nota1,nota2,nota3);
}
     
     public static void diagnostico(float a,float b,float c,){
       float promedio  
     }
             
}
