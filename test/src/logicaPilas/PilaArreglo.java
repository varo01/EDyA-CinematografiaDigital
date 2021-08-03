/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaPilas;

/**
 *
 * @author Jorge Quesada
 */
public class PilaArreglo implements pila {
    //atributo
    private Object P[];
    private int top;
    
    //contructor

    public PilaArreglo(int n) {
        if (n <= 0) {
            System.exit(n); // no existen pilas de tamano 0 o negativos
        }
        P = new Object[n]; //pia de objetos con tamano n
        top = -1;//aun no hay valores apilados
    }

    @Override
    public void push(Object element) {
        if (getSize() == P.length) {
            throw new RuntimeException("La pila esta llena");
        }
        P[++top] = element;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacia");
        }
        return P[top--];
    }

    @Override
    public Object top() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacia");
        }
        return P[top];
    }

    @Override
    public boolean isEmpty() throws RuntimeException {
        return top<0;
    }

    @Override
    public int getSize() throws RuntimeException {
        return top +1;
    }
    
    
    public String toString(){
        String stack = "";
        
        for (int i = 0; i <= top; i++) {
            stack += "Valor Apliado: " + P[i] + "\n";
        }
        return stack;
    }
    
}