/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;
import edu.eci.arsw.threads.CountThread;
/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread firstThread = new CountThread(0,99);
        CountThread secondThread = new CountThread(100,199);
        CountThread thirdThread = new CountThread(200, 299);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
        
    }
}
