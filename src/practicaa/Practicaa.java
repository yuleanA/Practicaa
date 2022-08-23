/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa;

import javax.swing.JOptionPane;

/**
 *
 * @author Yulean
 */
public class Practicaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Primer ejrcicio resuelto del libro de programacion del punto 2.5.
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //while(numero != 0)
        if (numero %2 == 0){
            System.out.println("El numero " + numero +" es par");
        } else {
            System.out.println("El numero " + numero +" es impar");
        }*/
        
        /*int numero, cont= 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        while(numero >= 0){
            JOptionPane.showMessageDialog(null,"Ha ingresado el numero: "+numero);
            cont++;
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null,"Numero no válido. Ingresó un total de "+cont+" numeros.");*/
        
         //Ejercicio #2 resuelto del libro de programacion del punto 2.5
        
        
         
         /*Ejercicio #3 resuelto del libro de programacion del punto 2.5 : Sucesión fibonacci
        
         int a = 0;
         int b = 1;
         int c = 0;
         
         for (int i= 0;i < 10; i++){
             System.out.println(a + ",");
             c = a + b;
             a = b;
             b = c;
         }*/
        
         
        /*Ejercicio #4 resuelto del libro de programacion del punto 2.5
        int base, exp;
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        exp =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
         
        System.out.println("resultado:" + Math.pow((double)base,(double)exp));
        System.out.println("resultado sumatoria de bases"+ (double) base * (double) exp );
        */
        
          
      //Ejercicio #5 resuelto del libro de programacion del punto 2.5
 
      int numero= 0;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero por favor"));
      if (numero %1 <= numero){
          
      }
      
      
      
      
      
      
      
      
    }
}
