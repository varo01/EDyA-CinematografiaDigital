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
public interface pila {
    
    //metodos>
    //ingresa valores en la pila (APILAR)
    public void push(Object element);
    
    //elimina (lo retorna) el ultimo valor ingresado en la pila
    public Object pop();
    
    //devuelve el ultimo valor ingresado en la pila pero no lo elimina
    public Object top()throws RuntimeException;
    
    //devuelve boolean si esta vacio o no
    public boolean isEmpty()throws RuntimeException;
    
    //devuelve cantidad de elementos en la pila
    public int getSize()throws RuntimeException;
    
}
