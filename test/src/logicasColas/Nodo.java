/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicasColas;

/**
 *
 * @author Jorge Quesada
 */
public class Nodo {
    
    Nodo next; //apunta al siguiente nodo
    Object element; //informacion contenida en el nodo

    public Nodo(Object element) {
        this.next = null;
        this.element = element;
    }
    
    
    
}
