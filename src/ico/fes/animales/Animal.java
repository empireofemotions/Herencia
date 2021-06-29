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
public class Animal {
    private int NumeroDePatas;

    public Animal() {
    }

    public Animal(int NumeroDePatas) {
        this.NumeroDePatas = NumeroDePatas;
    }

    public int getNumeroDePatas() {
        return NumeroDePatas;
    }

    public void setNumeroDePatas(int NumeroDePatas) {
        this.NumeroDePatas = NumeroDePatas;
    }
    
    public void HacerSonido(){
    }

    @Override
    public String toString() {
        return "Animal{" + "NumeroDePatas=" + NumeroDePatas + '}';
    }
    
    
}
