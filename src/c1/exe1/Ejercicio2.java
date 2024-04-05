/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
    
    float radCir1 = 4;
    float radCir2 = 2;
    
    float altCir1 = 5;
        double altCir2 = 2.5;
    
    final double PI = 3.1415;
    
    float areaTotal1 = (float) (2*PI*radCir1*(radCir1+altCir1));
    float areaTotal2 = (float) (2*PI*radCir2*(radCir2+altCir2));
            
        System.out.print("El área total del cilindo 1 es: ");
        System.out.println(areaTotal1);
        System.out.print("El área total del cilindo 2 es: ");
        System.out.println(areaTotal2);
    
    }
}
