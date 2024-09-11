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
public class EquipoNacional {
    public String pais; 
    public String color;
    private ArrayList<Atleta>pertenece=new ArrayList();

public EquipoNacional(){}
public EquipoNacional(String p, String c){
pais=p;color=c;
}
public ArrayList<Atleta> getPertenece(){
return pertenece;
}
public void setPertenece(ArrayList<Atleta>p){
 pertenece=p;
}
}
