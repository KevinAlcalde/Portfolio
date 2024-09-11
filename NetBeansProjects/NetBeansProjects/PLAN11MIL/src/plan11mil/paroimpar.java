/*
 pida la usuario que ingrese 10 nros enteros con la leyenda es par, para ello se definira una funcion cuyo nombre es esPar que recibira como ´raametros el nro entero ingresado y qeu devolvera un boolean que sera true cuando sea par y false cuando sea impar . tambien se definira un procedimiento cuyo nombre sera leyenda que recibira como´parametros un boolean, si ese boolean es true devera mosatrar el numero y la leyenda es pary si es false devera mostrar el numero y la leyenda es impar

 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class paroimpar {
    
    public static void main(String[] args) {
     int a[]=new int [10];
     for (int i=0;i<a.length;i++){
     String numeros = JOptionPane.showInputDialog("ingrese numero a verificar");
    = Integer.parseInt(numeros);
     }
    abundante(d1);
}
     
     public static boolean esPar(int a){
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
