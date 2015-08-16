/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memorama;

/**
 *
 * @author Omar
 */
import java.io.*;
public class Tiempo extends Thread{


    int segundos=0;
    int minutos=0;


    private void delaySegundo() {
         try{
Thread.sleep(1000);


}catch (InterruptedException e){}
}
}