/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cpf2;

/**
 *
 * @author lucho
 */
public class CPF2 {

        public static void imprimirMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) { // Cuerpo de la función
            System.out.println(mensaje);
        }
    }
    
    public static void main(String[] args) {
        String saludo = "¡Hola, mundo!";
        int n = 3;
        
        imprimirMensaje(saludo, n); // Llamada a la función
    }
}
