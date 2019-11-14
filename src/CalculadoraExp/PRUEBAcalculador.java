/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraExp;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class PRUEBAcalculador 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese expresion infija: ");
        String infija=sc.next();
        ConvertirAPosfija.convertir(infija);
        System.out.println("La expresion posfija es: "+ConvertirAPosfija.convertir(infija));
        System.out.println("El resultado es: "+EvaluarPosfija.evaluar(infija));
    }
}
