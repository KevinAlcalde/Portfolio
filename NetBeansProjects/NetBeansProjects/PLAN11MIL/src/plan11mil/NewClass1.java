/*
 Si el numero es menor que la sumatoria de sus divisores distintos de el es abundante
 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class NewClass1 {
   public static void main(String[] args) {
   int n;
     String nro = JOptionPane.showInputDialog("ingrese numero a verificar");
    n = Integer.parseInt(nro);
    abundante(n);
}
     
     public static void abundante(int a){
        int sum1=0;
        for(int i=1;i<a-1;i++) {
            if (a%i==0){
                sum1=sum1+i;
               
            }
        }
     if (sum1>=a){
         System.out.println("el nro es abundante");
     }
     else { System.out.println("no es abundante");
     }
     
     }              
}
