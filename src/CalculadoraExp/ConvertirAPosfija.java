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
public class ConvertirAPosfija 
{
    public static String convertir(String infija) {
        //metodo que convierte de expresion infija a posfija
        String posfija="";
        Pila pila=new Pila(100);
        for (int i = 0; i < infija.length(); i++) {
            char operador=infija.charAt(i);
            if(esOperador(operador)){
                if(pila.estaVacia()) pila.apilar(operador); //si la pila esta vacia devolvemos el operador
                else{
                    if(prioridadExpresion(operador)>prioridadPila((char)pila.ultimoElemento())) pila.apilar(operador);
                    else{
                        posfija+=pila.desapilar();
                        pila.apilar(operador);
                    }
                }
            }else posfija+=operador; //caso contrario añadimos el operador a la expresion
        }
        while(!pila.estaVacia()){
            posfija+=pila.desapilar();
        }
        return posfija; //al final devolveremos ya hecha la expresion posfija
    }
    
    //metodo que evalua si el caracter en cierta posicion es un operador
    private static boolean esOperador(char operador) {
        if(operador=='*' || operador=='/' || operador=='+' || operador=='-' ||  operador=='^') return true;
        return false;
    }
    //metodo para especificar la prioridad de la pila(?)
    private static int prioridadExpresion(char operador){ //cada operador de una expresion matematica tiene su propia prioridad
        if(operador=='^') return 4;                //de forma que esta prioridad permita responder correctamente a la expresion
        if(operador=='*' || operador=='/') return 2;
        if(operador=='+' || operador=='-') return 1;
        return 0;
    }
    private static int prioridadPila(char operador){
        if(operador=='^') return 3;
        if(operador=='*' || operador=='/') return 2;
        if(operador=='+' || operador=='-') return 1;
        return 0;
    }
}
