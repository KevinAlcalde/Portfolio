/*
pidiendo al usuario que ingrrese su nombre, el programa debera saludar al usuario con la primer letra en mayuscula 
el tranajo de convertir la primer letra sera la funcion mayusc.
 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class convertirdeminaMayus {
 public static void main(String[] args) { 
     String nombre;
     nombre = JOptionPane.showInputDialog("ingrese su nombre en minuscula");
   /*int e=edad(suNacim);
  System.out.println("su edad es "+ e+ "anos");*/
     
     System.out.println("el nro "+mayusc(nombre)); 
       /* System.out.println("ued"+m);*/
       // System.out.println("usted"+menorMayor(e));
      
    }
      
public static String mayusc(String nombre){//funcion
    if (nombre.isEmpty()) {
        return nombre;            
    } else {
        return Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1); 
    }
}
}


