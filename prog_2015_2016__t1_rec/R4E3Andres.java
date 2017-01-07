/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2015_2016__t1_rec;

import java.util.Scanner;

/**
 *3)Escribe un programa que rellene un array con 20 números aleatorios comprendidos entre 0 y 1000 y
    que los muestre por pantalla. A continuación, el programa pedirá dos números de los que se han
    mostrado. Por último, el programa dirá cuántos pasos hay que dar para pasar del primer número al
    segundo. Se supone que el usuario introduce correctamente los números, es decir, se encuentran en
    el array, no son el mismo, y el primer número aparece antes que el segundo.
    * 
 * @author PocyxDesigner
 */
public class R4E3Andres {
    public static void main(String[] args) {
        int[] array = new int[20];
        for(int i=0;i<array.length;i++){
            array[i]=(int) (Math.random()*1001);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Por favor, introduzca el primer número: ");
        Scanner s = new Scanner(System.in);
        int n1 =  Integer.parseInt(s.nextLine());
        System.out.print("Ahora introduzca el segundo número: ");
        int n2 = Integer.parseInt(s.nextLine());
        int posicion1=0;
        int pasos=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==n1){
                posicion1=i;
            }
        }
        for(int i=posicion1;i<array.length;i++){
            if(array[i]==n2){
                pasos=i-posicion1;
            }
        }
        System.out.print("Para pasar del "+n1+" al "+n2+" hay que dar "+pasos+" pasos.");
    }    
}
