/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import Excepcion.exceptionRun;

public class ArrayStack<E> implements Stack<E> {

    private E[] vector;
    private int size;
    private int n;
    
    //constructor
    public ArrayStack(){
        vector = (E[])(new Object[1]);
        size = 0;
    }
    
    public ArrayStack(int n){
        this.n = n;
        vector = (E[])(new Object[1]);
        size = 0;
        
    }
            
    
    //retorna si la pila esta llena
   public boolean isFull(){
       if(size == vector.length)
           return true;
       else
           return false;
           
   }
   
   //aumenta el tamaño del vector
   protected void stretch(){
       E[] newData = (E[]) (new Object[2 * vector.length]);
       
       for(int i = 0; i < vector.length; i++){
           newData[i] = vector[i];
       }
       vector = newData;
   }
    
    //retorna si la pila esta o no vacia
    public Boolean isEmpty() {
        return size == 0;
    }

    //retorna el ultimo elemento de la pila pero no lo elimina
    public E peek() throws exceptionRun{
        if(isEmpty()){
            throw new exceptionRun("NO");
        }
       return vector[size-1];
    }

    //retorna el ultimo elemento de la pila y lo elimina
    public E pop() {
      if(isEmpty()){
            throw new exceptionRun("NO");
        }
     --size;
     return vector[size];
    }

    //inserta un elemento en la cima de la pila
    public void pusk(E target) {
       if(isFull()){
           stretch();
       }
       vector[size] = target;
       ++size;
       
       
    }
    
    //ajusta el tamaño del vector al tamaño de la pila
    public void fix(){
        E[] newData2 = (E[]) (new Object[size]);
        if(!isEmpty() && size < vector.length){
            for(int i = 0; i < size; i++){
            newData2[1] = vector[i];
            }
            vector = newData2;
        }
    }
    
    public void clearAll(){
        vector = (E[])(new Object[1]);
        size = 0;
    }
    
    public int tamañoPila(){
        return size;
    }
    
    public void reiniciar(){
        vector = (E[])(new Object[1]);
        size = 0;
    }
    
    
    
    
    
    
  
}
