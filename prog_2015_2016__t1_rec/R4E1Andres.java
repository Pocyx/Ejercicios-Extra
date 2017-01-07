/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2015_2016__t1_rec;

import java.util.Scanner;

/**
 *
 *1)El nuevo partido político Izquierda Hacia la Izquierda nos ha pedido una aplicación que genere su
    logotipo. El logotipo de este partido es la letra I inclinada hacia la izquierda. Se debe pedir por teclado
    la altura del logotipo. La anchura siempre es de 4 asteriscos.
 * 
 * @author PocyxDesigner
 */
public class R4E1Andres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura del logotipo: ");
        int altura = Integer.parseInt(s.nextLine());
        int espacios = 0;
        int contador = 0;
        do{
            for(int i=0;i<espacios;i++){
                System.out.print(" ");
            }
            for(int i=0;i<4;i++){
                System.out.print("*");                
            }
            System.out.println();
            espacios++;
            contador++;
        }while(contador<=altura);

    }
}
