/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio3 {
     public static void main(String[] args) {
     
     float n1 = 6;
     
     float firstSum;
     float secondSum;
     float thirdSum;
     
     firstSum = n1*(n1+1)/2;
     secondSum = n1*(n1+1)*(2*n1+1)/6;
     thirdSum = (float) ((Math.pow(n1, 2))*(Math.pow(n1+1, 2))/4);
     
         System.out.print("El resultado de la primera sumatoria de numeros naturales es: ");
         System.out.println(firstSum);
         System.out.print("El resultado de la segunda sumatoria de numeros naturales elevados al cuadrado es: ");
         System.out.println(secondSum);
         System.out.print("El resultado de la primera sumatoria de numeros naturales elevados al cubo es: ");
         System.out.println(thirdSum);
    }
}
