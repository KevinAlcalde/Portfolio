/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

/**
 *
 * @author Windows
 */
public class Ejemploclase {

    /**
     * @param args
     */
    public static void main(String[]args) {
        
       Clase obj1=new Clase(1,2);
       Clase obj2=new Clase(3,4);
       Clase obj3=new Clase(5,6);
        System.out.println(obj1.a+";"+obj1.getM());
        System.out.println(obj2.a+";"+obj2.getM());
        System.out.println(obj3.a+";"+obj3.getM());
       
        
        /*System.out.println(obj2.b);
        System.out.println(Clase.b);
        Clase.b=25;
        System.out.println(Clase.b);
        Clase.b=38;
        System.out.println(Clase.b);
        System.out.println(Clase.b);*/
        
        
    }
    
}
