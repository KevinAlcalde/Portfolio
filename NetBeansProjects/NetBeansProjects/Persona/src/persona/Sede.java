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
public class Sede {
    private int fase;
    private int fecha;
    private int hora;
    public Sede(){}
    public Sede(int f, char fe,int h){
        fase=f;fecha=fe;hora=h;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFase() {
        return fase;
    }

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    
}
