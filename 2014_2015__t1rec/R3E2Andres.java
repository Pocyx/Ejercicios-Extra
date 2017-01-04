/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1rec;

/**
 *
 *2)Una pareja quiere pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores
    más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres colores
    aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los que
    debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
 * 
 * @author PocyxDesigner
 */
public class R3E2Andres {
    public static void main(String[] args) {
        
        String[]  colores = {"Verde","Rojo","Azul","Amarillo","Naranja","Violeta"};
        
        int color1;
        int color2;
        int color3;

        do {
          color1 = (int)(Math.random() * 6);
          color2 = (int)(Math.random() * 6);
          color3 = (int)(Math.random() * 6);
        } while ((color1 == color2) || (color1 == color3) || (color2 == color3));
        
        System.out.println("Habitación 1: "+colores[color1]+", habitación 2: "+colores[color2]+" y habitación 3: "+colores[color3]);
    }
}
