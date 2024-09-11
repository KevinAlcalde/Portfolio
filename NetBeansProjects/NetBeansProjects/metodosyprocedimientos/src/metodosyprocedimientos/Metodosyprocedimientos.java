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
public class Metodosyprocedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int suNacim=Integer.parseInt(JOptionPane.showInputDialog("ingrese su ano de nacimiento"));
   /*int e=edad(suNacim);
  System.out.println("su edad es "+ e+ "anos");*/
      System.out.println("usted tiene"+edad(suNacim)+"años");
      int e=edad(suNacim);
     /* String m= menorMayor(e);
        System.out.println("usted"+m);*/
       // System.out.println("usted"+menorMayor(e));
        System.out.println("usted"+ menorMayor(edad(suNacim)));
    }
    public static int edad(int sn){//funcion
    //  int edad=2018-sn;
      
    return (2018-sn) ;  
    }
public static String menorMayor(int ed){//funcion
String mensaje;  
if (ed>=18)
  mensaje= "es mayor de edad";
else 
mensaje="es menor de edad";

    return mensaje;  
    }
