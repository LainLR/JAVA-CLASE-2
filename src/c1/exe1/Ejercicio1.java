/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c1.exe1;

/**
 *
 * @author xio
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miNum = 2;
        
        float miResultado;
        
        miResultado = (2 * (float)Math.pow(miNum, -3) + 5 * (float)Math.pow(miNum, 2) - 8 * miNum) / (float)Math.sqrt(9 * (float)Math.pow(miNum, 3) - 2 * (float)Math.pow(miNum, 2) + miNum);
    
        System.out.print('El resultado de la operación es: ');
        System.out.println(miNum);
    }
    
}
