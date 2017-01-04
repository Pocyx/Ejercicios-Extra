/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1rec;

import java.util.Scanner;

/**
 *
 *4)Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
    se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
    colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
    posiciones.
 * 
 * @author PocyxDesigner
 */
public class R3E4Andres {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int [] termina7 = new int [10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<numeros.length;i++){
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            int numero = Integer.parseInt(s.nextLine());
            numeros[i]=numero;
            
        }
        
        
        
        // Muestra el array original.  
        System.out.println("\n\nArray de 10 numeros enteros :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5d   ", numeros[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        
        
        int orden = 0;
      
        System.out.println("");
      
        
        
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%10!=7){
                termina7[orden]=numeros[i];
                orden++;
            }    
        }
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%10==7){
                termina7[orden]=numeros[i];
                orden++;
            }    
        }
        
        
        
        
        
        System.out.println("\n\nArray ordenado por números terminados en 7 al final :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Sietes");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5d   ", termina7[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
    }
}
