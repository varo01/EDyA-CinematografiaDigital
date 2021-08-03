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
public interface List {
    
    //Cantidad de nodos que tiene la lista enlazada
    public int getSize();
    
    //Eiminiar, destruir, anular toda la lista
    public void canel();
    
    //True/False segun la lista si esta vacia o no
    public boolean isEmpty();
    
    //Agrega un nuevo nodo a la lista
    public void insert (Object element);
    
    //Elimina un elemento de la lista
    public void delete (Object element) throws ListException;
    
    //Devuelve la posicion de un elemento de la lista
    public int getPosition(Object element) throws ListException;
    
    //Devuelve true/false si existe un elemento en la lista
    public boolean exists(Object element) throws ListException;
    
}
