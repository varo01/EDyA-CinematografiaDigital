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
public class PilaEnlazada implements pila{

    //atributos
    private Nodo top; //representa el inicio de la pila (similar al inicio de una lista)
    private int count; //lleva el control del numero de elementos apilados

    public PilaEnlazada() {
        top = null;
        count = 0;
    }
    
    
    @Override
    public void push(Object element) {
        Nodo newNodo = new Nodo(element);
        if (isEmpty()) {
            top = newNodo;
        }else{
            newNodo.next = top;
            top = newNodo;
        }
        count++;
    }

    @Override
    public Object pop() {
        count --;
        top = top.next;
        return top;
    }

    @Override
    public Object top() throws RuntimeException {
        if (isEmpty()) {
            return new RuntimeException("pila vacia");
        }
        return top.element;
    }

    @Override
    public boolean isEmpty() throws RuntimeException {
        return top==null;
    }

    @Override
    public int getSize() throws RuntimeException {
        return count;
    }
    
    
}