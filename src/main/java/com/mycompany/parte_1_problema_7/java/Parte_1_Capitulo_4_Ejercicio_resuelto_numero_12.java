/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_1_problema_7.java;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_1_Capitulo_4_Ejercicio_resuelto_numero_12 {

    public static void main(String[] args) {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner lector = new Scanner(System.in);
        
        String nom;
        int nht, het, hee8;
        double vhn, salario;
        
        System.out.println("Ingrese los nombres del trabajador:");
        nom = lector.nextLine();
        System.out.println("Ingrese el número de horas que el trabajador hizo durante la semana:");
        nht = lector.nextInt();
        System.out.println("Ingrese el valor de la hora normal del trabajador:");
        vhn = lector.nextDouble();
        
        if (nht>40) {
            het = nht-40;
            if (het>8) {
                hee8 = het-8;
                salario = 40*vhn+16*vhn+hee8*3*vhn;
            } else {
                salario = 40*vhn+het*2*vhn;
            }
        } else{
            salario = vhn*nht;
        }
        
        System.out.println("El trabajador "+nom+" devengó: $"+salario);
    }
}
