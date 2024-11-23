/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_1_problema_7.java;

/**
 *
 * @author Samuel Cataño C
 */
public class Trabajador {
    String nombres;
    int horas;
    double valor_hora;
    
    public Trabajador(String nombres, int horas, double valor_hora){
        this.nombres = nombres;
        this.horas = horas;
        this.valor_hora = valor_hora;
    }
    
    public double salario(){
        if (this.horas<=40) {
            return Math.floor(100*this.horas*this.valor_hora+1/2)/100;
        } else if (this.horas<=48) {
            return Math.floor(100*(40*this.valor_hora+(this.horas-40)*2*this.valor_hora)+1/2)/100;
        } else {
            return Math.floor(100*(40*this.valor_hora+8*2*this.valor_hora+(this.horas-48)*3*this.valor_hora)+1/2)/100;
        }
    }
}
