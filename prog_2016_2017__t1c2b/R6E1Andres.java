/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2016_2017__t1c2b;

/**
 *
 *1)Muestra por pantalla una secuencia aleatoria de 10 números múltiplos de 7 comprendidos entre el 140
    y el 210 ambos incluidos.
 * 
 * @author PocyxDesigner
 */
public class R6E1Andres {
    public static void main(String[] args) {
        int contador = 0;
        while(contador<10){
            //Genera un número aleatorio entre 330 y 880
            int aleatorio = (int) (Math.random()*70)+140;
            //Comprueba que el número aleatrorio está entre 330 y 550.
            if(aleatorio%7==0 && aleatorio<551){
                contador++;
                //Imprime 10 números aleatorios multiplos de 11.
                System.out.print(aleatorio+" ");
            }
        }
    }
}
