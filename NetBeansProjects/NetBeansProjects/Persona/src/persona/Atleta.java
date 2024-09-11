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
public class Atleta extends Persona implements Contrato {
    private int edad;
    private float peso;
    private float altura;
    public Atleta(int DNI){
        super(DNI);
    }
     public Atleta(int DNI,String nombre){
        super(DNI,nombre);}
     public Atleta(int DNI,String nombre,int edad,float peso,float altura){
        super(DNI,nombre);
        this.edad=edad;this.peso=peso;this.altura=altura;
     }
     public float calculaIMC(){
         return(float)(peso/Math.pow(altura,2));
     }
     public float tomarPulsaciones(){
         return 200F;
     }
    public boolean hayPesoExtra(float imc){
         boolean hpe;
         if(imc<=24.9F)
             hpe=false;
         else hpe=true;
         return hpe;
     }   
}
