/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio6 {
     public static void main(String[] args) {
     
     int n1 = (int)(Math.random()*100+1);
     int n2 = (int)(Math.random()*100+1);
     int n3 = (int)(Math.random()*100+1);
     int n4 = (int)(Math.random()*100+1);
     
         System.out.print("Tús números son: ");
         System.out.print(n1);
         System.out.print(", ");
         System.out.print(n2);
         System.out.print(", ");
         System.out.print(n3);
         System.out.print(", ");
         System.out.println(n4);
         
    int mySum;
    
        mySum = n1+n2+n3+n4/4;
        
         System.out.print("El promedio es: ");
         System.out.println(mySum);
         
     }
    
}
