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
public class darcodigoaschii {
     public static void main(String[] args) {
    String palabra;
    palabra = JOptionPane.showInputDialog("ingrese su nombre en minuscula");
     for(int i=0;i<palabra.trim().length();i++){
         System.out.println("el caracter:"+palabra.trim().charAt(i)+"tiene el ascii"+ darCodigo(palabra.trim().charAt(i)));   
     }     
            
            }
     public static int darCodigo(char c){
         return(int)c;
     }
}
