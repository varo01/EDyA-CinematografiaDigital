/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaListas;

/**
 *
 * @author betoq
 */
public class Nodo {

    //Atributos
    public Object element; //informacion que almacena cada nodo
    public Nodo next, before; //puntero al siguiente nodo
    //Atributos
    
    //constructor
    public Nodo(Object element) {
        this.element = element;
        this.next = null;
        this.before = null;
    }
    
}
