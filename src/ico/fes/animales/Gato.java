/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author EDUARDO
 */
public class Gato extends Animal {
    private String raza;

    public Gato() {
    }

    public Gato(String raza) {
        this.raza = raza;
    }
    
    public Gato(String raza, int NumeroDePatas) {
        super(NumeroDePatas);
        this.raza = raza;
    }
    
    @Override
    public void HacerSonido(){
        System.out.println("*Maullando*");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "Gato{" + "raza=" + raza + '}';
        
    }
    
    
    
}
