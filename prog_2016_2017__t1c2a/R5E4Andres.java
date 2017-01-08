/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_2016_2017__t1c2a;

import java.util.Scanner;

/**
 *
 * @author PocyxDesigner
 */
public class R5E4Andres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("Inroduzca la longitud del camino: ");
        int longitud = Integer.parseInt(s.nextLine());
        int l = 0;
        int espacios = 5;
        while(l<=longitud){
            if(l>=0){
                int ale = (int) (Math.random()*3);
                    if(ale == 0){
                        espacios=espacios-1;
                    }else if(ale == 1){
                        espacios=espacios;
                    }else if(ale == 2){
                        espacios=espacios+1;
                    }
                for(int i=0;i<=espacios;i++){
                    
                    System.out.print(" ");
                }
                System.out.print("#");
                int obstaculo = (int)(Math.random()*3);
                for(int i=0;i<4;i++){
                    if(obstaculo==0){
                        System.out.print(" ");
                        obstaculo=0;
                    }else if(obstaculo==1){
                        System.out.print("O");
                        obstaculo=0;
                    }else if(obstaculo==2){
                        System.out.print("*");
                        obstaculo=0;
                    }
                }
                System.out.println("#");
                
            }
            l++;
        }
        
    }
}
