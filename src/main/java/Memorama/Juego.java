/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;

import java.util.Random;

/**
 *
 * @author Omar
 */
public class Juego {
        public int[] getImagenesJuego() {
        
        int[] numeros = new int[12];
        int cartas = 0;
        
        while(cartas < 12) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[cartas] = na;
                cartas++;
            }
            
        }
        
        
        return numeros;
    }
            
}
