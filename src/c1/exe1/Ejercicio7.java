/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

import java.util.Scanner;

/**
 *
 * @author xio
 */
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        float myRad;
        final float PI = 3.1415f;
        
        System.out.println("Digite el radio del circulo: ");
        myRad = entrada.nextFloat();
        
        float myArea;
            myArea = PI*(float)(Math.pow(myRad,2));
            
            System.out.println("El área de tu circulo es: "+myArea);
    
    }
    
}
