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
public class Ejercicio10 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        float myRad;
        final float PI = 3.1415f;
        
        System.out.println("Digite el radio de la esfera: ");
        myRad = entrada.nextFloat();
        
        float myVol;
            myVol = (4/3)*PI*(float)(Math.pow(myRad,3));
            
            System.out.println("El ára de tu circulo es: "+myVol);
    
    }
    
}
