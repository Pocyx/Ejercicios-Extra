/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2b;

import java.util.Scanner;



/**
 *
 *4)Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
    adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
    relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
    adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
    2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
    ésta última es mayor o igual que 4.
 * @author PocyxDesigner
 */
public class R2E4Andres {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura del arbol: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    //System.out.print("Introduzca el caracter de relleno: ");
    //String relleno = s.nextLine();
    
    
    int altura1 = 0;
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida-1;
    
    if(altura1 < altura){
        // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la linea
      for (i = 1; i < altura * 2; i++) {
         
        System.out.print("*");
      }

      System.out.println();
    }
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la linea
      for (i = 1; i < altura * 2; i++) {
          int caracter = (int) (Math.random()*9);
          switch(caracter){
              case 0:
              case 1:
                  System.out.print("O");
                  break;
              case 2:
                  System.out.print("*");
                  break;
              default:
                  System.out.print("^");
                  break;
          }
          
      }

      System.out.println();

      altura++;
      espacios--;
    }
  }
}
