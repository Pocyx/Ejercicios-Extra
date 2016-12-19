/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2a;

import java.util.Scanner;

/**
 *
 *2)Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
    caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
    fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
    puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
    por el usuario y deberá ser mayor o igual a 3.
 * 
 * @author PocyxDesigner
 */
public class R1E2Andres {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, indique la altura del plano inclinado: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        int altura=alturaIntroducida;
        int caracter=1;
        int aleatorio = (int) ((Math.random()*alturaIntroducida)+1);
        do{
            for(int i=0;i<caracter;i++){
                System.out.print("#");
                
            }
            if(caracter==aleatorio){
                    System.out.print("O");
                }
            System.out.println();
            caracter++;
            altura--;
        }while(altura>0);
        
    }
  
}
