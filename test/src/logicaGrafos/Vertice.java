/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import logicaListas.CircularDoubleLinkedList;

/**
 *
 * @author Jorge Quesada
 */
public class Vertice {
    
    //Atributos
    
    boolean visited;
    boolean destination;
    Object element;
    //cuando se programe el grafo con listas se necesita:
    CircularDoubleLinkedList listaAritas, listaPesos;
    
    public Vertice(Object element){
        this.element = element;
        this.visited = false;
        listaAritas = new CircularDoubleLinkedList();
        listaPesos = new CircularDoubleLinkedList();
    }
}
