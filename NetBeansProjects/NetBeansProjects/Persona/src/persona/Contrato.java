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
public interface Contrato {
    float tomarPulsaciones();
    boolean hayPesoExtra(float imc);
    float calculaIMC();
    
}
