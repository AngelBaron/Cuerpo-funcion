/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cpf;

/**
 *
 * @author lucho
 */
public class CPF {

   public static int calcularSuma(int a, int b) {
        int suma = a + b; // Cuerpo de la función
        return suma;
    }
    
    public static void main(String[] args) {
        int x = 5, y = 3, resultado;
        
        resultado = calcularSuma(x, y); // Llamada a la función
        
        System.out.println("La suma es " + resultado);
    }
}
