/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2b;

import java.util.Scanner;

/**
 *
 *2)Escribe un programa que pida 6 palabras y las almacene en un array. A continuación, en otro array se deben
    guardar las mismas palabras pero esta vez cambiadas de orden de forma aleatoria.
 * 
 * @author PocyxDesigner
 */
public class R2E2Andres {
    public static void main(String[] args) {
        String [] palabras = new String[6];
        String [] desorden = new String[6];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<palabras.length;i++){
            System.out.print("Introduzca una palabra "+i+": ");
            palabras[i]=s.nextLine();
        }
        // Muestra el array original.  
        System.out.println("\n\nArray original :");

        System.out.print("┌");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 6; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 6; i++) {
            System.out.printf("  %5s   ", palabras[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        //////////////////
        for(int i=0;i<palabras.length;i++){
            boolean repetido;
            //Definimos la variable que será un número aleatorio entre 1-10.
            String aleatorio;
            do{
                repetido = false;
                aleatorio = palabras[(int)(Math.random()*6)];
                
                for(int e=0;e<i;e++){
                    
                    if(desorden[e]==aleatorio){
                        repetido = true;
                    }
                }
                
            }while(repetido);
            desorden[i]=aleatorio;
        }
        
        // Muestra el array original.  
        System.out.println("\n\nArray desordenado:");

        System.out.print("┌");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 6; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 6; i++) {
            System.out.printf("  %5s   ", desorden[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 6; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        
    }
  
}
