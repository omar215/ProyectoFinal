/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.util.ArrayList; 
import javax.swing.JLabel; 
import java.util.Random;

/**
 *
 * @author Omar
 */
import java.util.Random;

public class Memorama {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[12];
        int count = 0;
        
        while(count < 12) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[count] = na;
                count++;
            }
            
    }
        for (int i = 0; i < 12; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
