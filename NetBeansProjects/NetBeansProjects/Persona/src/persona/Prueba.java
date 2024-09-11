/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class Prueba {
    private int codigo;
    private String titulo;
    private ArrayList<Instalacion>
            donde=new ArrayList();
    private ArrayList<Atleta>
            participa;
    public Prueba(){
        participa=new ArrayList();
    }
     public Prueba(int c, String t){
       codigo=c;titulo=t; participa=new ArrayList();
    }

    Object getParticipa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
}
