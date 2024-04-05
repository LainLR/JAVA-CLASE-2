/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio4 {
    public static void main(String[] args) {
    
        int a1 = 1;
        int a2 = 2;
        
        int  b1 = 3;
        int b2 = 4;
        
        System.out.print("Las coordenadas del punto A son: "+a1);
        System.out.print(",");
        System.out.println(a2);
        System.out.print("Las coordenadas del punto B son: "+b1);
        System.out.print(",");
        System.out.println(b2);
        
        float coordinates2D;
        
        coordinates2D = (float) (Math.sqrt(Math.pow(b1-a1, 2)+(Math.pow(b2-a2, 2))));
        
        System.out.print("La distancia entre esos dos puntos es: ");
        System.out.println(coordinates2D);
        
        int c1 = 1;
        int c2 = 4;
        int c3 = 3;
        
        int d1 = 3;
        int d2 = 9;
        int d3 = 5;
        
        System.out.print("Las coordenadas del punto C son: "+c1);
        System.out.print(",");
        System.out.print(c2);
        System.out.print(",");
        System.out.println(c3);
        System.out.print("Las coordenadas del punto D son: "+d1);
        System.out.print(",");
        System.out.print(d2);
        System.out.print(",");
        System.out.println(d3);
        
        float coordinates3D;
        
        coordinates3D = (float) (Math.sqrt(Math.pow(d1-c1, 2)+(Math.pow(d2-c2, 2))+(Math.pow(d3-c3, 2))));
        System.out.print("La distancia entre esos dos puntos es: ");
        System.out.println(coordinates3D);
             
    }
    
}
