/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread{
    private int A;
    private int B;

    public CountThread(){
    }
    public CountThread(int A, int B){
        this.A=A;
        this.B=B;
    }

    private int getA(){
        return A;
    }

    private int getB(){
        return B;
    }

    public void run(){
        System.out.println("thread is running... ");
        count();
    }
    public void count(){
        for(int i = getA(); i <= getB(); i++ ){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        CountThread thread = new CountThread();
        thread.start();
    }
}
