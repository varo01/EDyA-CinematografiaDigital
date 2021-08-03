/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Jorge Quesada
 */
public class Peliculas {
    
    //atributos
    String nombre;
    String Sinopsis;
    String categora;
    int codigoParental;
    int duracion;
    
    //constructor
    public Peliculas(String nombre, String Sinopsis, String categora, int codigoParental, int duracion) {
        this.nombre = nombre;
        this.Sinopsis = Sinopsis;
        this.categora = categora;
        this.codigoParental = codigoParental;
        this.duracion = duracion;
    }
    
}
