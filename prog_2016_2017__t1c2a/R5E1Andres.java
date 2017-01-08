/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2016_2017__t1c2a;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class R5E1Andres {
    public static void main(String[] args) {
        //Array en el que introduzco los números.
        int [] numeros = new int[10];
        //Array que utilizo para comprobar si se repirten
        int [] numeros2 = new int[10];
        Scanner s = new Scanner(System.in);
        //Relleno el array numeros con diez números introducidos por teclado.
        for(int i=0;i<numeros.length;i++){
            System.out.print("Introduzca el número "+(i+1)+" : ");
            int numero = Integer.parseInt(s.nextLine());
            numeros[i]=numero;
        }
        //Introduzco los números del array números en el array números2.
        for(int i=0;i<numeros2.length;i++){
            numeros2[i]=numeros[i];
            
        }

        int repetido=0;
        int contadorRepetidos = 0;
        for(int i=0;i<numeros.length;i++){
            
            
            for(int e=0;e<i;e++){
                if(numeros[i]==numeros2[e]){
                    contadorRepetidos++;
                
                repetido = numeros[i];
                
                }
            }
            
            
        }
        System.out.println("El número que más aprece es el "+repetido+", se repite "+contadorRepetidos+" veces.");
        
        
    }
}
