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
public class Ejercicio9 {
    public static void main(String[] args) {
    
     Scanner entrada = new Scanner(System.in);
        
        int myNum;
        System.out.println("Digite un número: ");
            myNum = entrada.nextInt();
            
        if (myNum%2 == 0 ) {
            System.out.println("El número es par");
            }
        else{
            System.out.println("El número es impar");
        }
    
    
    }
    
}
