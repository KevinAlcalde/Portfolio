/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosyprocedimientos;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class NewClass {
 public static void main(String[] args) { 
      int nro=Integer.parseInt(JOptionPane.showInputDialog("ingrese un nro entero"));
   /*int e=edad(suNacim);
  System.out.println("su edad es "+ e+ "anos");*/
      
     String a= numero(nro);
     System.out.println("el nro "+numero(nro)); 
       /* System.out.println("ued"+m);*/
       // System.out.println("usted"+menorMayor(e));
      
    }
      
public static String numero(int nro){//funcion
  String mensaje;
if (nro%2==0)
  mensaje = "es par ";
else 
mensaje="es impar";

    return mensaje;  
}
 }  

