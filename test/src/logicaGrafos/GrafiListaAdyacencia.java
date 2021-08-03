/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica; 

import logicaPilas.PilaEnlazada;
import logicasColas.ColaEnlazada;

/**
 *
 * @author Jorge Quesada
 */
public class GrafiListaAdyacencia implements Grafo{
    
    //atributos
    private Vertice[] vertices;
    private GrafoMatrizAdyacencia matrizAdyacencia;
    private int count;
    private int n;
    private PilaEnlazada pila;
    private ColaEnlazada cola;

    public GrafiListaAdyacencia(int n) {
        if (n <= 0) {
            System.exit(0);
        }
        
        this.n = n;
        count = 0;
        vertices = new Vertice[n];
        pila = new PilaEnlazada();
        cola = new ColaEnlazada();
    }

    @Override
    public void addVertex(Object element) throws RuntimeException {
        if (count >= vertices.length) {
            throw new RuntimeException("Grafo lleno");
        }
        vertices[count ++] = new Vertice(element);
    }

    @Override
    public void addEdge(Object v1, Object v2) throws RuntimeException {
        if (!existVertex(v1) || !existVertex(v2)) {
            throw new RuntimeException("Alguno o ambos  vertices no existen");
        }
        vertices[getPosition(v1)].listaAritas.insert(v2);
        vertices[getPosition(v2)].listaAritas.insert(v1); 
    }
    // metodo auxiliar que me indica donde esta cada vertice dentro de la matriz
    public int getPosition (Object element){
        for (int i = 0; i < count; i++) {
            if (vertices[i].element.equals(element)) {
                return i;
            }
        }
        return -1; // el vertice no existe
    }

    @Override
    public void addWeight(Object v1, Object v2, Object weight) {
        
        if (!existVertex(v1) || !existVertex(v2)) {
            throw new RuntimeException("Alguno o ambos  vertices no existen");
        }
        vertices[getPosition(v1)].listaPesos.insert(weight);
        vertices[getPosition(v2)].listaPesos.insert(weight);
    }
    
    @Override
    public void destry() {
        vertices = null;
    }

    @Override
    public int getSize() throws RuntimeException {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean existVertex(Object element) throws RuntimeException {
        for (int i = 0; i < count; i++) {
            if (vertices[i].element.equals(element)) {
                return true;
            }
        }
        return false;
    }

    
    
    
    
    
    
    
    
    @Override
    public String dfs() {
        
        String info = "DFS: ";
        vertices[0].visited = true;
        info += showVertex(0);
        
        pila.push(0);
        
        while (!pila.isEmpty()){
            int v = adjacentVertexNotVisited(Integer.parseInt(pila.top().toString()));
            if (v == -1) {
                pila.pop();
            }else{
                vertices[v].visited = true;
                info += showVertex(v) + "-->";
                pila.push(v);
            }
        }
        
        for (int i = 0; i < count; i++) {
            vertices[i].visited = false;
        }
        return info;
    }
    
    
    
    @Override
    public boolean existEdge(Object v1, Object v2) throws RuntimeException {
        return vertices[getPosition(v1)].listaAritas.exists(v2);
    }

    
    private String showVertex (int position) throws RuntimeException{
        if (position < 0 || position == count) {
            throw new RuntimeException ("Vertice no encontrado");
        }
        return vertices[position].element.toString();
    }
    
    private int adjacentVertexNotVisited(int v) throws RuntimeException {
        
        for (int i = 0; i < count; i++) {
            if (vertices[i].listaAritas.exists(showVertex(v)) && vertices[i].visited == false) {
                return i; //retornamos el indice
            }
        }
        
        return -1;
        
    }
    
    

    @Override
    public String bfs(){
        String info = "";
        vertices [0].visited = true;
        info += showVertex(0);
        cola.queue(0);
        
        while(!cola.isEmpty()){
            
            for (int i = 0; i < count; i++) {
                if (vertices[i].listaAritas.exists(showVertex(count))) {
                    ????????????????????????????????
                }
            }
        }
        
        return info;
    }
}