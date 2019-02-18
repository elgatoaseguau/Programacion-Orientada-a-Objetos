/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.herencia;

public class Division extends Operacion{
    double div = 0; 
    public Division(double n1, double n2) {    
        super(n1, n2, '/');
        this.div = n1 / n2;
        this.setRes(this.div);
    }
}