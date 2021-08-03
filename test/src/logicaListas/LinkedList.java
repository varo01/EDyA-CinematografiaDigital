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
public class LinkedList implements List{
    
    //Atributos
    Nodo start;

    public LinkedList() {
        start = null; //representa el inicio de la lista 
    }

    @Override
    public int getSize() {
        //verificamos si la lista esta vacia
        if (isEmpty()) {
            return 0;
        }
        
        Nodo aux = start;
        int cont = 0;
        
        while (aux != null){
            //agregamos un 1 al conteo de nodos
            cont++;
            // me muevo a la ste posicion
            aux = aux.next;
        }
        
        return cont;
    }

    @Override
    public void canel() {
        start = null;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public void insert(Object element) {
        
       Nodo newNode = new Nodo (element);
       Nodo aux = start;
       
       //condicion 1: cuando la lista esta vacia:
        if (isEmpty()) {
            start = newNode;
        }//condicion2: cuando la lista no esta vacia
        else{
            while(aux.next != null){
                //nos tenemos que mover una posicion a la derecha
                aux = aux.next;
            }//while
            aux.next = newNode;// enlace al nuevo nodo
        }//endElse
    }//endInsert

    @Override
    public void delete(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPosition(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean exists(Object element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
