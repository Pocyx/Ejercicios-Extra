/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2015_2016__t1_rec;

import java.util.Scanner;

/**
 *
 *4)Realiza un programa que gestione los votos de las próximas elecciones. La aplicación debe cumplir
    los siguientes requisitos:
    a) Los nombres de los partidos se deben guardar en un array llamada nombrePartido que se debe
    inicializar al principio del programa con los siguientes nombres: Ciudadanos, Podemos, PP, PSOE,
    Izquierda Unida y UpyD.
    b) El programa debe pedir el número de votos que ha obtenido cada uno de los partidos. Estos
    datos se deben guardar en un array llamado votacion.
    c) El programa calculará la media de todas las votaciones y la mostrará por pantalla.
    d) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
    encima de la media son: " seguido de los nombres de los partidos cuyos votos han sido superiores
    a la media.
    e) A continuación, el programa mostrará el mensaje: "Los partidos que han obtenido votos por
    debajo de la media son: " seguido de los nombres de los partidos cuyos votos han sido inferiores a
    la media.
 * 
 * @author PocyxDesigner
 */
public class R4E4Andres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] nombrePartido = {"Ciudadanos", "Podemos", "PP", "PSOE","Izquierda Unida", "UpyD"};
        int[] votacion = new int[6];
        int suma=0;
        //int ciudadanos,podemos,pp,psoe,iu,upyd;
        for(int i=0;i<votacion.length;i++){
            System.out.print("Introduzca votos del "+nombrePartido[i]+" : ");
            votacion[i]=Integer.parseInt(s.nextLine());
            suma = suma+votacion[i];
        }
        int media = suma/votacion.length;
        System.out.println("La media de los votos es: "+media);
        System.out.print("Los partidos que han obtenido votos por encima de la media son: ");
        for(int i=0;i<votacion.length;i++){
            if(votacion[i]>=media){
                System.out.print(nombrePartido[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Los partidos que han obtenido votos por debajo de la media son: ");
        for(int i=0;i<votacion.length;i++){
            if(votacion[i]<media){
                System.out.print(nombrePartido[i]+" ");
            }
        }                                                 
    }
}
