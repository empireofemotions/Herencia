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
public class Perro extends Animal {
    private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }
    
    public Perro(String raza, int NumeroDePatas) {
        super(NumeroDePatas);
        this.raza = raza;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    /**
     *
     */
    @Override
     public void HacerSonido(){
        System.out.println("*Ladrando*");
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "raza=" + raza + '}';
    }
    
      
}
