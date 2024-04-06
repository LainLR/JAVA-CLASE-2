/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio5 {
    public static void main(String[] args) {
    
    float myAngle = (float) 18.4567;
    
    float findDegree;
    
    float myDegree;
            
            myDegree = (int)myAngle;
    
    findDegree = myAngle - myDegree;
    
        System.out.print("Tu ángulo es: ");
        System.out.println(myAngle);
        
    float myMinutes;
    
            myMinutes = myDegree*60;
        
    float mySeconds;
    
            mySeconds = myMinutes*60;
    
        System.out.print("Tu grado es: ");
        System.out.println(myDegree);
        System.out.print("Tus minutos son: ");
        System.out.println(myMinutes);
        System.out.print("Tus segundos son: ");
        System.out.println(mySeconds);
    
    }
    
}
