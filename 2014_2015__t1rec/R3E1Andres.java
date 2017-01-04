/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1rec;

import java.util.Scanner;

/**
 *
 *1) Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
 * 
 * @author PocyxDesigner
 */
public class R3E1Andres {
    public static void main(String[] args) {
        Scanner teclear = new Scanner(System.in);
        long numero;
        int cantidad=0;
        long ultimo=0;

        System.out.print("Por favor, introduzca un número entero positivo: " );
        long numeroIntro = Long.parseLong(teclear.nextLine());
        numero = numeroIntro;
        do{
            numero = numero/10;
            cantidad++;
        }while(numero>0);
        long[] posicion=new long[cantidad];
        numero = numeroIntro;
        
        for(int i=0;i<posicion.length;i++){
            ultimo = numero%10;  
            posicion[i]=ultimo;
            numero = numero/10;   
        }
        System.out.println("-----> "+posicion[(int)(Math.random()*cantidad)]);
    }
}
