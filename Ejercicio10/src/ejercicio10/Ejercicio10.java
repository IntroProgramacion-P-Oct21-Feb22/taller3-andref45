/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author andref45
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución del problema 
        int var1 = 25; 
        int var2 = 10;
        int var3 = 100;
        boolean var4 = true;
        boolean var5 = false; 
        int var6 = 5;
        int var7 = 2;
        
        boolean resultado = (Math.sqrt(var1)* var2 >= var3) && (var4)||(var5)
                || ((var2/var6) >= var7);
        
        System.out.println(resultado);
                
    }
    
}
