/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2014_2015__t1c2b;

import java.util.Scanner;

/**
 *
 *1)Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
    de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
    secuencia de platos en función de las siguientes condiciones: (a) De primer plato puede haber ensalada, pasta
    o arroz (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu que irán
    acompañados con una guarnición que puede ser patatas bravas, verduras a la plancha o pimientos asados (c)
    De postre puede haber flan, helado o arroz con leche (d) Cuando el primer plato es arroz, el postre no puede ser
    arroz con leche (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
 * 
 * @author PocyxDesigner
 */
public class R2E1Andres {
    public static void main(String[] args) {
        String[] primero = {"ensalada","pasta","arroz"};
        String[] segundo = {"hamburguesas de soja","filetes de seitán","albondigas de tofu"};
        String[] postre = {"flan","helado","arroz con leche"};
        String[] guarnicion = {"patatas bravas","verduras a la plancha","pimientos asados"};
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7 correspondiente a un día de la semana: ");
        int dia = Integer.parseInt(s.nextLine());
        switch(dia){
            case 1:
                
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print("Menu del dia: ");
                int primerPlato=(int)(Math.random()*3);
                int segundoPlato=(int)(Math.random()*3);
                
                System.out.print(primero[primerPlato]+", ");
                if(segundo[segundoPlato].equals("albondigas de tofu")){
                    System.out.print(segundo[segundoPlato]+" con "+guarnicion[(int)(Math.random()*3)]+" y ");
                }else{
                    System.out.print(segundo[segundoPlato]+" y ");
                }
                if(!primero[primerPlato].equals("arroz")){
                    System.out.print(postre[(int)(Math.random()*3)]);
                }else if(primero[primerPlato].equals("arroz")){
                    System.out.print(postre[(int)(Math.random()*2)]);
                }
                
                
                break;
            case 6:
            case 7:
                System.out.print("Los fines de semana no hay menu, lo sentimos.");
        }
        System.out.println();
    }
}
