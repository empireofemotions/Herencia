/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaanimales;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;

/**
 *
 * @author EDUARDO
 */
public class HerenciaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro clifford = new Perro("French Poodle", 4);
        Gato garfield = new Gato("Exótico", 4);
        
        System.out.println(clifford);
        System.out.println(garfield);
    }
    
}
