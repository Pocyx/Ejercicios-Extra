/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1rec;

import java.util.Scanner;

/**
 *
 *3)Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud del
    brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
 * 
 * 
 * @author PocyxDesigner
 */
public class R3E3Andres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud del brazo de la cruz: ");
        int  longitudBrazo = Integer.parseInt(s.nextLine());
        int superior=0;
        int medio=0;
        int inferior=0;
        int espacios=longitudBrazo*2;
        do{
            for(int i=0;i<espacios;i++){
                System.out.print(" ");
            }
            System.out.println("*");
            superior++;
        }while(superior<longitudBrazo);
        
        do{
            System.out.print("* ");
            medio++;
        }while(medio<longitudBrazo*2+1);
        System.out.println();
        do{
            for(int i=0;i<espacios;i++){
                System.out.print(" ");
            }
            System.out.println("*");
            inferior++;
        }while(inferior<longitudBrazo);
    }
}
