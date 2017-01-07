/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2015_2016__t1_rec;

import java.util.Scanner;

/**
 *
 *2)Realiza un programa que genere la versión tacaña de un número a partir de otro introducido por
    teclado. La versión tacaña es aquella que contiene los mismos dígitos o menos que el número original
    y en el mismo orden. A efectos prácticos es como quitarle dígitos de forma aleatoria a un determinado
    número.
 * 
 * @author PocyxDesigner
 */
public class R4E2Andres {
    public static void main(String[] args) {
        Scanner teclear = new Scanner(System.in);
        long numero;
        int cantidad=0;
        long ultimo=0;

        System.out.print("Por favor, introduzca un número: " );
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
        
        for(int i=posicion.length-1;i>0;i--){
            //50% de posibilidades de que aparezca un número o no.
            int aparece = (int)(Math.random()*2);
            if(aparece==1){
                System.out.print(posicion[i]);
            }
        }
    }  
}
