/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Windows
 */
public class Persona {
private String  nombre;
private final int DNI;  
  public Persona (int DNI){
      this.DNI=DNI;
  }
   public Persona (int DNI, String nombre){
      this.DNI=DNI;
      this.nombre=nombre;
      
  }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void main(String[] args) {
     Atleta at1= new Atleta(12345,"Perez,Juan",18,70F,1.50F);   
     float imc =at1.calculaIMC();
        System.out.println("IMC para"+at1.getNombre()+"-"+imc);
        if(at1.hayPesoExtra(imc))
            System.out.println("Hay peso estra");
        else
            System.out.println("Supeso es normal");
    EquipoNacional en= new EquipoNacional("Argentina","celeste y blanco");
    Atleta at2= new Atleta(123456,"Lopez,Anibal",22,60f,1.62f);
    en.getPertenece().add(at1);
    en.getPertenece().add(at2);
    for(Atleta todos: en.getPertenece()){
        System.out.println("Nombre:"+todos.getNombre()+"altura:"+todos.getAltura()+"mts.");
    }
    Prueba pr1=new Prueba(1,"AB");
    Prueba pr2=new Prueba(2,"CD");
    Instalacion in= new Instalacion("Fubol",'A','B',"GCruz");
    in.getSeHace().add(pr1);
    in.getSeHace().add(pr2);
    in.getSeHace().get(1).getParticipa().add(at1);

    }
    
}
