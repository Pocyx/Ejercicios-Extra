/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2a;

import java.util.Scanner;

/**
 *
 *3)Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa debe
    pedir el día de la semana (un número del 1 al 7) y debe mostrar de forma aleatoria la secuencia del
    entrenamiento en función de las siguientes pautas:
    - El entrenamiento empieza siempre con un calentamiento que puede ser bicicleta, elíptica o cinta.
    - A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los grupos musculares
    grandes son espalda, pecho y piernas y los grupos musculares pequeños son biceps, triceps y hombros.
    - El entrenamiento finaliza con abdominales o con ejercicio aeróbico (bicicleta, elíptica o cinta). En caso de
    finalizar con aeróbico, no se puede repetir el ejercicio que se hizo en el calentamiento.
    - Los miércoles y los domingos son días de descanso.
 * 
 * @author PocyxDesigner
 */
public class R1E3Andres {
    public static void main(String[] args) {
        String[] calentamiento = {"bicicleta","eliptica","cinta"};
        String[] muscGrande = {"pecho","espalda","piernas"};
        String[] muscPequeno = {"biceps","triceps","hombros"};
        String[] enfriamiento = {"abdominales",calentamiento[(int)(Math.random()*3)]};
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7 correspondiente a un día de la semana: ");
        int dia = Integer.parseInt(s.nextLine());
        switch(dia){
            case 1:
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.print("Su entrenamiento de hoy es el siguiente: "+calentamiento[(int)(Math.random()*3)]+", "
                        +muscGrande[(int)(Math.random()*3)]+", "+muscPequeno[(int)(Math.random()*3)]+" y "
                        +enfriamiento[(int)(Math.random()*2)]);
                break;
        }
        System.out.println();
    }
}
