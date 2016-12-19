/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2b;

import java.util.Scanner;

/**
 *
 *3)Realiza un programa que elimine un determinado dígito de un número introducido por teclado. Utiliza el tipo long
    donde sea necesario para aceptar números largos.
 * 
 * @author PocyxDesigner
 */
public class R2E3Andres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        Integer iNumero = Integer.parseInt(s.nextLine());
        
        //selecciona el número que desea eliminar.
        System.out.print("¿Qué cifra desea eliminar? ");
        char nEliminado = s.next().charAt(0);
        //String nEliChar = String.valueOf(nEliminado);
        char nEliChar = (char)(nEliminado);
        char[] nums = iNumero.toString().toCharArray();
        for(char c: nums) {
            if(nEliChar==c){
                System.out.print("");
            }else{
                System.out.print(c + " ");
            }
            
        }
        
        
    }
}
