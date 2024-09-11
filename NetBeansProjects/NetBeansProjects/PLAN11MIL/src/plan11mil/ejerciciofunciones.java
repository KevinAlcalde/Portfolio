/*
1.Cada opción debe enviar la ejecución del programa a una función que, reciba como parámetros los datos necesarios para el cálculo de la superficie correspondiente y devolver el resultado.
2.El resultado de la función debe ser recibido (como parámetro) por un procedimiento que, según la opción elegida por el operador, mostrará un mensaje acompañando a tal resultado.
3.El programa principal debe tener control sobre la opción elegida por el operador, ya que si elige una opción inexistente, debe emitir un mensaje de advertencia y volver a mostrar el menú. Este último puede ser mostrado por un procedimiento o por el programa principal

 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class ejerciciofunciones {
  public static void main(String[] args) {
       int acum=0;
        int seleccion;
        int lado;
        int base;
        int altura;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int i = 0;
        String texto;
        String nombre;
   
                do {
                    String opcion = JOptionPane.showInputDialog(null, "\t INGRESE SUPERFICIE A CALCULAR REALIZAR \n1.CUADRADO\n2.RECTANGULO\n3.CIRCULO\n4.SALIR Y TERMINAR");
                    seleccion = Integer.parseInt(opcion);
                    switch (seleccion) {
                        case 1:
                            String l1 = JOptionPane.showInputDialog(null, "Ingrese lado");
                                lado = Integer.parseInt(l1);
                                System.out.println(" El area del circulo es:",area1(lado)); 
                         
                            break;
                        case 2:
                            do {
                                String b = JOptionPane.showInputDialog(null, "Ingrese extraccion");
                                base = Integer.parseInt(b);
                                String h = JOptionPane.showInputDialog(null, "Ingrese extraccion");
                                altura = Integer.parseInt(h);
                                if (base < 0 || altura < 0) {
                                    JOptionPane.showMessageDialog(null, "INGRESE VALOR POSitivo");
                                }
                          
                                i++;

                            } while (base >0|| altura> 0);
                             
                                 JOptionPane.showMessageDialog(null, "El area de rectangulo es " + area2(base,altura));
                            }
                               
                         
                            break;
                           case 3:
                            JOptionPane.showMessageDialog(null, "Su saldo es: " + si);
                         
                            break;
                            case 4:
                            JOptionPane.showMessageDialog(null, "Salir");
                            break;
                
                } while (seleccion !=4);
  }



public static int area1(int lado){
   int area1; 
    area1=  lado*lado;
return area1;
}

public static int area2(int base, int altura){
   int area2; 
    area2=  base*altura;
return area2;
}
}
public static int area1(int lado){
   int area1; 
    area1=  lado*lado;
return area1;
}
}
}