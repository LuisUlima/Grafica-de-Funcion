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
public class EvaluarPosfija 
{
    public static double evaluar(String infija){
        //este metodo recibira la expresion infija(x+y*w) como un string
        String posfija=ConvertirAPosfija.convertir(infija);
        return evaluarPosfija(posfija);
    }
    
    private static double evaluarPosfija(String posfija) {
        Pila pila=new Pila(100);
        for (int i = 0; i < posfija.length(); i++) {
            char operador=posfija.charAt(i);
            if(!esOperador(operador)){
                //la linea con '+""' convierte el operador a String, de forma que ahora si, lo convierte a numero
                double a=new Double(operador+""); //convierte el "operador" de un char a un numero
                pila.apilar(a);
            }else{
                double c2=(double) pila.desapilar();
                double c1=(double) pila.desapilar();
                double c3=Operar(operador,c1,c2);
                pila.apilar(c3);
            }
        }return (double) pila.ultimoElemento();
    }
    
    private static double Operar(char operador, double c1, double c2) {
        if(operador=='*') return c1*c2;
        if(operador=='/') return c1/c2;
        if(operador=='+') return c1+c2;
        if(operador=='-') return c1-c2;
        if(operador=='^') return Math.pow(c1, c2);
        return 0;
    }
    private static boolean esOperador(char operador) {
        if(operador=='*' || operador=='/' || operador=='+' || operador=='-' ||  operador=='^') return true;
        return false;
    }
}
