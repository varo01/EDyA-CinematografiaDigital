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
public interface Cola {
    
    //devuelve el numero de elementos
    public int getSize() throws RuntimeException;
    
    //eliminar o reiniciar la cola
    public void cancel();
    
    //retorna si la cola esta vacia o no
    public boolean isEmpty();
    
    //encola un elemento por un extremo
    public void queue(Object element) throws RuntimeException;
    
    //desecola un elemento por el otro extremo de la estructura
    public Object dequeue() throws RuntimeException;
    
    //retorna el elemento que se encuentra en alguno de los dos extremos 
    public Object front() throws RuntimeException;
    
    //tarea moral: verificar si algun elemento existe en la cola
    //public boolean exist();
    
}
