/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2a;

import java.util.Scanner;

/**
 *
 * 1)Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se formará
    con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares. Se debe conservar
    el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que cada trozo esté bien formado.
    Utiliza el tipo long donde sea necesario para aceptar números largos.
 * 
 * @author PocyxDesigner
 */
public class R1E1Andres {
    public static void main(String[] args) {
        Scanner teclear = new Scanner(System.in);
        long numero;
        int cantidad=0;
        long ultimo=0;

        System.out.print("Introduzca un número entero: " );
        long numeroIntro = Long.parseLong(teclear.nextLine());
        numero = numeroIntro;
        do{
            numero = numero/10;
            cantidad++;
        }while(numero>0);
        long[] posicion=new long[cantidad];
        numero = numeroIntro;
        //System.out.println("-----------"+numero);
        for(int i=0;i<posicion.length;i++){
            ultimo = numero%10;
            
            posicion[i]=ultimo;
            numero = numero/10;
            
            
        }
        
        //System.out.println("-----------");
        //for(int i=0;i<posicion.length;i++){
            //System.out.print(posicion[i]);
        //}
        
        long[] primerTrozo =new long[cantidad];
        long[] segundoTrozo=new long[cantidad];
        int cont1 =0;
        int cont2 =0;
        for(int i=cantidad;i>0;i--){
            //System.out.println("   \ni: "+i);
            if(i%2==0){
                segundoTrozo[cont1]=posicion[i-1];
                cont1++;
            }else{
                primerTrozo[cont2]=posicion[i-1];
                cont2++;
            }
            
            
        }
        System.out.print("Primer trozo: ");
        
        for(int i=0;i<posicion.length;i++){
            for(int e=0;e<posicion.length;e++){
                if(primerTrozo[i]==posicion[e]){
                    System.out.print(primerTrozo[i]);
                }
            }
            
        }
        System.out.println();
        System.out.print("Sugundo trozo : ");
        for(int i=0;i<posicion.length;i++){
            for(int e=0;e<posicion.length;e++){
                if(primerTrozo[i]==posicion[e]){
                    System.out.print(segundoTrozo[i]);
                }
            }
            
        }
        System.out.println();
        
    }
}
