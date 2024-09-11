/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Windows
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Animal.CIN);
        System.out.println(Fun.CIN);
        System.out.println(Hombre.CIN);
        System.out.println(Perro.CIN);
        Perro c1=new Perro();
        System.out.println("metodo contar:"+c1.contar());
        Hombre c2=new Hombre();
        System.out.println("metodo promediar"+c2.promediar());
    }
    
}
