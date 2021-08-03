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
public class GrafoMatrizAdyacencia implements Grafo{
    
    //Atributos
    private Vertice[] vertices; //arreglo de vertices
    Object[][] matrizAdyacencia; //permite controlar las aristas y los pesos
    int count; 
    //algoritmos de recoridos
    private PilaEnlazada pila;
    private ColaEnlazada cola;
    int n; //determina el tamano que va a tener el grafo

    //constructor
    public GrafoMatrizAdyacencia(int n) {
        if (n <= 0) {
           System.exit(0);
        }
        this.n = n;
        vertices = new Vertice[n]; //inicializamos el grafo ocn el tamaño que quiera el usuario
        matrizAdyacencia = new Object[n][n];
        resetMatriz();
        count = 0; //cantidad de vertices almacenados
    }//fin constructor
    
    public void resetMatriz(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAdyacencia [i][j] = 0;
            }
        }
    }

    @Override
    public void destry() {
        for (int i = 0; i < count; i++) {
            vertices[i] = null;
        }
        count = 0; //ya no hay vertices
        resetMatriz();
    }

    @Override
    public int getSize() throws RuntimeException {
        if (isEmpty()) {
            return 0;
        }
        return count; // TO DO : VERIFICAR LA VARIABLE DESPUES DE ALMACENAR NU VERTICE!!!!!!!!!!!!!!!!
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
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
    public boolean existEdge(Object v1, Object v2) throws RuntimeException {
        if (matrizAdyacencia[getPosition(v1)][getPosition(v2)].equals(0)) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void addVertex(Object element) throws RuntimeException {
        if (count >= vertices.length) {
            throw new RuntimeException("El grafo ya esta lleno");
        }
        vertices[count++] = new Vertice(element);
    }

    @Override
    public void addEdge(Object v1, Object v2) throws RuntimeException {
        //paso 1 > verificar que existen los vertices
        if (!existVertex(v1) || !existVertex(v2)) {
            throw new RuntimeException("alguno o ambos vertices no existe");
        }
        matrizAdyacencia[getPosition(v1)][getPosition(v2)] = -1;
        //cuando el grafo es dirigido, comentar la siguiente linea:
        matrizAdyacencia[getPosition(v2)][getPosition(v1)] = 1;
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
        String info = "";
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (matrizAdyacencia[i][j] != (Object)0) {
                    info += vertices[i].element + " -----> "+ vertices[j].element + "\n";
                    if (matrizAdyacencia[i][j] != (Object)1) {
                    info += "Weight: " + matrizAdyacencia[i][j] + " \n";
                    }
                }
            }
        }
        matrizAdyacencia[getPosition(v1)][getPosition(v2)] = weight;
    }

    public String dfs() {
        
        String info = "DFS: ";
        vertices[0].visited = true;
        info = showVertex(0);
        
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
    public String bfs() {
        
        String info = "";
        vertices[0].visited = true;
        info += showVertex(0);
        
        cola.queue(0);
        
        while (!cola.isEmpty()){
            
        }
        
        return info;
    }

    
    public String toString(){
        String info = "INFORMACION DEL GRAFO:\n";
        info += "con matriz de Adyacencia\n";
        info += "-------------------------\n";
        for (int i = 0; i < count; i++) {
            info += "El vertice en la posicion: " + i + " es: " + vertices[i].element+ "\n";
        }
        info += "Aristas y pesos: \n";
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (matrizAdyacencia[i][j] != (Object)0) {
                    info += vertices[i].element + " -----> "+ vertices[j].element + "\n";
                    if (matrizAdyacencia[i][j] != (Object)1) {
                    info += "Weight: " + matrizAdyacencia[i][j] + " \n";
                    }
                }
            }
        }
        info += "\n";
        
        return info;
    }
    
    
}
