/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2016_2017__t1c2b;

import java.util.Scanner;

/**
 *
 *2)Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
    guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
    GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
    como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
    distinguir bien. Por cada 5 números mostrados hay un salto de línea.
 * 
 * @author PocyxDesigner
 */
public class R6E2Andres {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
        }
        Scanner s = new Scanner(System.in);
        int[] favoritos = new int[5];
        System.out.println("Por favor, introduzca sus 5 números favoritos: ");
        for(int i=0;i<favoritos.length;i++){
            favoritos[i]=Integer.parseInt(s.nextLine());
        }
        String gusto="";
        for(int i=0;i<numeros.length;i++){
            for(int e=0;e<favoritos.length;e++){
                if(numeros[i]==favoritos[e]){
                    gusto="ME GUSTA";
                    break;
                }else{
                    gusto="no me gusta";
                }     
            }
            System.out.print(numeros[i]+" "+gusto+", ");
        }
        
    }
}
