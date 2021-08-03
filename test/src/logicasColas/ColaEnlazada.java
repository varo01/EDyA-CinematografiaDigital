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
public class ColaEnlazada implements Cola{
    
    
    //atributos
    Nodo anterior, posterior;

    //contructor
    public ColaEnlazada() {
        this.anterior = this.posterior = null;
    }

    @Override
    public int getSize() throws RuntimeException {
        Nodo posicionActual;
        int contador  = 0;
        
        posicionActual = anterior;
        
        while (anterior.next != null){
            contador++;
            posicionActual = anterior.next;
        }
        
        return contador;
    }

    @Override
    public void cancel() {
        posterior = anterior = null;
    }

    @Override
    public boolean isEmpty() {
        return anterior == null;
    }

    @Override
    public void queue(Object element) throws RuntimeException {
        
        Nodo newNodo = new Nodo (element);
        
        //verificar cuando la cola esta vacia
        if(isEmpty()){//no hay nada en la cola aun
            anterior = new Nodo(element);
            //para llevar el contorl de los 2 apuntadores
            posterior = anterior;
        }else{
            //cuando ya existe algun elemento
            newNodo.next = anterior;
            anterior = newNodo;
        }
    }

    @Override
    public Object front() throws RuntimeException {
        
        Nodo posicionActual = anterior;
        
        while (anterior.next != null){
            posicionActual = anterior.next;
        }
        
        return posicionActual.element;
    }
    
    public String toString(){
        
        String inf = "";
        Nodo aux = anterior;
        
        while(aux!= null){ 
            inf = inf + aux.element.toString();
            aux = aux.next;
        }
        
        return inf.toString();
    }
    
    
    @Override
    public Object dequeue() throws RuntimeException {
        
        Nodo ultimoIngresado = anterior;
        Nodo aux = anterior.next;
        
        while(aux.next != null){
            ultimoIngresado = aux;
            aux = anterior.next;
        }
        
        posterior = ultimoIngresado;
        posterior.next = null;
        
        return aux;
    }
    
}
