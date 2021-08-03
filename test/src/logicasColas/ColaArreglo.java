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
public class ColaArreglo implements Cola{
    
    private Object C[]; //arreglo que permite controlar la cola
    private int anterior, posterior;
    
    public ColaArreglo(int n){
        C = new Object[n];//inicializamos la cola, la cual por le momento esta vacia
        this.anterior = this.posterior = n-1;
    }    

    @Override
    public int getSize() throws RuntimeException {
        int cantidad = C.length;
        
        return cantidad;
    }

    @Override
    public void cancel() {
        C = null;
    }

    @Override
    public boolean isEmpty() {
        int cantidad = C.length;
        
        if (cantidad != 0) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void queue(Object element) throws RuntimeException {
        C[anterior] = element;
        anterior --;
    }
    
    
    @Override
    public Object front() throws RuntimeException {
        return C[0];
    }
    
    public String toString(){
        String lista = "";
        
        for (int i = 0; i < C.length; i++) {
            lista = lista + C[i];
        }
        return lista;
    }

    @Override
    public Object dequeue() throws RuntimeException {
        
        C[0] = null;
        
        for (int i = 0; i < C.length; i++) {
            
            C[i] = C[i - 1];
        }
        return C;
    }

}
