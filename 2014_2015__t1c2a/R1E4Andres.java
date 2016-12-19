/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2a;



/**
 *
 *4)Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
    otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
    números repetidos en el array original.
 * 
 * @author PocyxDesigner
 */
public class R1E4Andres {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int [] desorden = new int[10];
        
        for(int i=0; i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*100);
        }
        // Muestra el array original.  
        System.out.println("\n\nArray de 10 numeros enteros :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5s   ", numeros[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        //////////////////
        for(int i=0;i<numeros.length;i++){
            boolean repetido;
            //Definimos la variable que será un número aleatorio entre 1-10.
            int aleatorio;
            do{
                repetido = false;
                aleatorio = numeros[(int)(Math.random()*10)];
                //System.out.println("aleatorio antes del for: "+aleatorio+" ");
                for(int e=0;e<i;e++){
                    //System.out.print("array["+e+"]= "+desorden[e]+" ");
                    if(desorden[e]==aleatorio){
                        repetido = true;
                    }
                }
                
            }while(repetido);
            desorden[i]=aleatorio;
        }
        
        // Muestra el array original.  
        System.out.println("\n\nArray de 10 numeros enteros desordenados :");

        System.out.print("┌");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┬");
        }
        System.out.print("────┐");
        System.out.print("\n│ Índice ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %5d    ", i);
        }

        System.out.print("\n├");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┼");
        }
        System.out.print("────┤");
        System.out.print("\n│ Numeros");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %5s   ", desorden[i]);
        }
 

        System.out.print("\n└");
        for (int i = 0; i < 10; i++) {
            System.out.print("─────┴");
        }
        System.out.print("────┘");
        
    }
}
