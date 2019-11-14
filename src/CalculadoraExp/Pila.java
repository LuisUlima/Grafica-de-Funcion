/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraExp;

/**
 *
 * @author Luis
 */
public class Pila 
{
    private int n; //tamaño máximo de la pila
    private int elem; //cuantos elementos tenemos apilados (en el ejemplo esta como "tope")
    private Object pila[]; //la pila como un arreglo
    
    //constructor para n
    public Pila(int n) {
        this.n = n;
        elem=0; //el numero de elementos inicia como 0
        pila=new Object[n]; //para poder apilar n elementos
    }
    
    //metodo para verificar si la pila esta vacia
    public boolean estaVacia(){
        return elem==0; //cuando no hay ningun elemento devuelve "true"
    }
    //si la pila esta llena 
    public boolean estaLlena(){
        return elem==n; //devuelve true cuando la pila alcanzo los n elementos
    }
    //metodo para apilar elementos
    public boolean apilar(Object x){
        if(estaLlena()) return false;
        else{
            pila[elem]=x;
            elem++;
            return true;
        }
    }
    //metodo para desapilar
    public Object desapilar(){
        if(estaVacia()) return null;
        else{
            elem--;
            return pila[elem];
        }
    }
    public Object ultimoElemento(){ //elemento que se encuentra al tope de la pila
        return pila[elem-1];
    }
}
