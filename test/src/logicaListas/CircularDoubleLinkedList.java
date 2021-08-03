/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaListas;

/**
 *
 * @author Jorge Quesada
 */
public class CircularDoubleLinkedList implements List{
    
    //Atributos
    Nodo start, end;
    int count;

    //constructor
    public CircularDoubleLinkedList() {
        this.start = null;
        this.end = null;
        this.count = 0;
    }
    
    

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void canel() {
        start = end = null;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
        
    }

    @Override
    public void insert(Object element) {
        
        Nodo aux = start; //defino auxiliar para moverme por la lista y no perder el inicio
        Nodo newNodo = new Nodo(element);
        
        if (start == null) {
            start = end = newNodo;
        }else{
            while(aux != end){
                aux = aux.next; //nos movemos al siguiente modo
            }//se sale cuando llega al final
            aux.next = newNodo;
            newNodo.before = aux;
            end = newNodo;
        }
        
        end.next = start;
        start.before = end;
        
    }

    @Override
    public void delete(Object element){
        
        Nodo aux = start;
        Nodo previous = start;
        Nodo upnext = start;
        
        while (aux.next.element != element){
            previous = aux.before;
            aux = aux.next;
            upnext = (aux.next).next;
        }
        
        previous.next = aux.next;
        upnext.before = aux.before;
        
    }
    
    public void edit(Object element){
        
        Nodo aux = start;
        
        while (aux.element != element){
            aux = aux.next;
        }
        
        aux.element = element;
    }
    
    public Object firstInList(){
        
        Nodo aux = start;
        
        return aux.element;
        
    }
    
    public Object lastInList(){
        
        Nodo aux = start;
        
        while(aux.next != start){
            aux = aux.next;
        }
        
        return aux.element;
    }
    
    @Override
    public int getPosition(Object element) throws ListException {
        
        Nodo aux = start;
        int count = 0;
        
        while(aux.element != element){
            count ++;
            aux = aux.next;
        }
        
        return count;
    }

    @Override
    public boolean exists(Object element) throws ListException {
        
        Nodo aux = start;
        boolean exists = false;
        
        while (aux.next != start){
            if (aux.element != element) {
                aux = aux.next;
            }else{
                exists = true;
                break;
            }
        }
        
        return exists;
    }
    
    public void orderCirculaDoubleLinkedList(){
        
        
        
    }
}
