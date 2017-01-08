/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2016_2017__t1c2a;

/**
 *
 * @author PocyxDesigner
 */
public class R5E3Andres {
    public static void main(String[] args) {
        //Array con los nombres de las piezas.
        String [] piezas={"Dama","Torre","Alfil","Caballo","Peón"};
        // Array con sus valores
        int [] valor = {9,5,3,2,1};
        System.out.println("Fichas capturadas por el jugador: ");
        System.out.println("");
        //Número aleatorio entre 0-15.
        int aleatorio = (int) (Math.random()*16);
        //Puntos totales.
        int puntos = 0;
        switch(aleatorio){
            //una posibilidad entre 15
            case 0:
                System.out.println("Dama(9 peones)");
                puntos=puntos+9;
            //dos posibilidades entre 15.
            case 1:   
            case 2:
                System.out.println("Torre(5 peones)");
                puntos=puntos+5;
            //dos posibilidades entre 15.
            case 3:
            case 4:
                System.out.println("Alfil(3 peones)");
                puntos=puntos+3;
            //dos posibilidades entre 15.  
            case 5:
            case 6:
                System.out.println("Caballo(2 peones)");
                puntos=puntos+2;
            //ocho posibilidades entre 15.
            default:
                System.out.println("Peón(1 peones)");
                puntos=puntos+1;
                
        }
        
        System.out.println("Puntos totales = "+puntos);
        
    }
}
