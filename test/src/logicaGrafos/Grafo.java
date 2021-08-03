/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Jorge Quesada
 */
public interface Grafo {
    
    //elimina todo el grafo
    public void destry();
    
    //devuelve la cantidad de vertices que tiene el grafo
    public int getSize()throws RuntimeException;
    
    //devuelve boolean si el grafo esta vacion
    public boolean isEmpty();
    
    //primitivos
    //booleas si ya existe el vertice
    public boolean existVertex(Object element) throws RuntimeException;
    
    //boolean si ya existe arista
    public boolean existEdge (Object v1, Object v2) throws RuntimeException;
    
    //agrega una arista en el grafo
    public void addVertex (Object element) throws RuntimeException;
    
    //agregar una arista que permite unir 2 vertices
    public void addEdge (Object v1, Object v2) throws RuntimeException;
    
    //agrega peso a una arista
    public void addWeight (Object v1, Object v2, Object weight);
    
    //algoritmos de recorrido
    public String dfs(); //depth first search- busqueda en profundidad
    public String bfs(); //breadth first search- busqueda en amplitud
}
