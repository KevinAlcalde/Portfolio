package cajerojavakevin;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows
 */
public class cajerokevin2 {
     public static void main(String[] args) {
       int acum=0;
        int seleccion;
        int si = 1000;
        int deposito;
        int extraccion;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int i = 0;
        String texto;
        String nombre;
        String usuario = "kevin";
        String contrasena = "7";
        do{
          nombre = JOptionPane.showInputDialog("Introduzca usuario");
          texto = JOptionPane.showInputDialog("Introduzca contraseÃ±a");
            if (nombre.equals(usuario) && texto.equals(contrasena)) {
                Myicon icon = new Myicon();
                JOptionPane.showMessageDialog(null, "BIENVENIDO A NUESTRO SISMEMA:" + " " + usuario,"",JOptionPane.DEFAULT_OPTION, icon);
                do {
                    String opcion = JOptionPane.showInputDialog(null, "\t INGRESE OPERACIoN A REALIZAR \n1.DEPOSITO\n2.EXTRACCION\n3.CONSULTAR SALDO\n4.ACCIONES REALIZADAS\n5.SALIR");
                    seleccion = Integer.parseInt(opcion);
                    switch (seleccion) {
                        case 1:
                            do {
                                String monto = JOptionPane.showInputDialog(null, "Ingrese deposito");
                                deposito = Integer.parseInt(monto);
                                
                                if (deposito < 0 || deposito == 0) {
                                    JOptionPane.showMessageDialog(null, "ingrese valor positivo y distinto de cero");
                                }
                                i++;
                            } while (deposito < 0 || deposito == 0);
                            si = si   + deposito;
                            acum=acum +deposito;
                            JOptionPane.showMessageDialog(null, "Su saldo es: " + si);
                            c1 += 1;
                            break;
                        case 2:
                            do {
                                String dinero = JOptionPane.showInputDialog(null, "Ingrese extraccion");
                                extraccion = Integer.parseInt(dinero);
                                if (extraccion < 0 || extraccion == 0) {
                                    JOptionPane.showMessageDialog(null, "INGRESE VALOR POSITIVO y distinto de cero");
                                }
                          
                                i++;

                            } while (extraccion < 0 || extraccion == 0);
                             
                    si = si - extraccion;
                    acum= acum+extraccion;  
                                if (si < 0) {
                                JOptionPane.showMessageDialog(null, "No dispone de ese saldo");
                               
                              } else if (extraccion<=si){
                                   
                                 JOptionPane.showMessageDialog(null, "Su saldo es: " + si);
                            }
                                  c2 += 1;
                         
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Su saldo es: " + si);
                            c3 += 1;
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Se realizaron las siguientes operaciones: \n" + c1 + ": Depositos\n" + c2 + ": Extraccion\n" + c3 + ": Muestra de saldo");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Salir");
                            break;
                    }
                } while (seleccion != 5);
                
            } else{
                JOptionPane.showMessageDialog(null, "Introduzca un usuario y una contrasena valida");
            }
            }while (!(nombre.equals("0")));
           
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");

     }
}


