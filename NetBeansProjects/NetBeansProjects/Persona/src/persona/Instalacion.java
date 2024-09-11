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
public class Instalacion {
    private String nombre;
    private char tipo;
    private char categoria;
    private String localizcion;
    private ArrayList<Prueba>seHace= new ArrayList();

    public Instalacion(String nombre, char tipo, char categoria, String localizcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.localizcion = localizcion;
    }

    public Instalacion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String getLocalizcion() {
        return localizcion;
    }

    public void setLocalizcion(String localizcion) {
        this.localizcion = localizcion;
    }

    public ArrayList<Prueba> getSeHace() {
        return seHace;
    }

    public void setSeHace(ArrayList<Prueba> seHace) {
        this.seHace = seHace;
    }



    
}
