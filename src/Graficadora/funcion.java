/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
package Graficadora;

import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;     // CODIGO PARA IMPORTAR LAS FUNCIONES DE LA JEP

public class funcion {
    JEP j=new JEP();
    public funcion(String def){  //CONSTRUCTOR CREANDO LA DEFINICION DE LA FUNCION
    j.addVariable("x",0); // VALIDAR LA VARIABLE X
    j.addStandardConstants(); //CONNSTANTES
    j.addStandardFunctions(); //FUNCIONES
    j.parseExpression(def);
    if(j.hasError()){  //VERIFICAR SI HAY HERRORES
       System.out.print(j.getErrorInfo());  
    }
    }
    public double evaluar (double x){ //METODO PARA EVALUAR EL VALOR X
    double r; // CREAR UNA VARIABLE r
    j.addVariable("x", x); //VARIABLE X EVALUADA EN EL METODO
    r=j.getValue(); // RESULTADO DE LA OPERACION ANTERIOR, ALMACENADO EN LA VARIABLE CREADA r
    if(j.hasError()){  // ACA SE REPORTA SI HAY UN ERROR
         JOptionPane.showMessageDialog(null,"Error, vía no implementada");     //.showMessageDialog(this,"Propietario no registrado!!");
//      System.out.print(j.getErrorInfo());  
    }
    return r; // SI NO HAY ERRORES ARROJA LOQUE ESTA EN LA VARIABE r
    }
    }
    
