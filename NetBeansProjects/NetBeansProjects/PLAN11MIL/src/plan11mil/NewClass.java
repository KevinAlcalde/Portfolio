/*
 Se dice que un nu ero es perfecto si la suma de sus divisores distintos de el es igual a el.
construya un procedimiento cuyo nombre sera perfecto recibiendo como parametro y un numero entero y mistarando en pantalla si es perfecto o no lo es.
 */
package plan11mil;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class NewClass {

    public static void main(String[] args) {
        int n;
        String nro = JOptionPane.showInputDialog("ingrese numero a verificar");
        n = Integer.parseInt(nro);
        perfecto(n);
    }

    public static void perfecto(int a) {
        int sum1 = 0;
        for (int i = 1; i < a - 1; i++) {
            if (a % i == 0) {
                sum1 = sum1 + i;

            }
        }
        if (sum1 == a) {
            System.out.println("el nro es perfecto");
        } else {
            System.out.println("no es perfecto");
        }

    }
}
