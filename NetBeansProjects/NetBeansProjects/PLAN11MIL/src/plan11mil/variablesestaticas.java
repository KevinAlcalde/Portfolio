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
public class variablesestaticas {
       public static int a=8;
         public static void main(String[] args) {
        int cuadrado = a*a;
        mostrar();
        int calc=calcular(cuadrado);
        mostrar();
             System.out.println("cuadrado"+cuadrado);
             System.out.println("FUNCION CALCULAR" + calc);
    }

    public static void mostrar() {
     
        System.out.println("la variable de clase"+ a);
    }
      public static int calcular(int m) {
     
        System.out.println("la variable de clase"+ a);
        a=a+m;
        return m*2;
    }
       
}
