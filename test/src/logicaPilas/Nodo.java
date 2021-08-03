/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaPilas;

/**
 *
 * @author Jorge Quesada
 */
public class Nodo {
    
    public Nodo next;
    public Object element;

    public Nodo(Object element) {
        this.next = null;
        this.element = element;
    }
}
