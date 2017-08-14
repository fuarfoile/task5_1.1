/*
 * Main.java 14/08/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task5;

public class Main {

    public static void main(String[] args) {
	    new Thread(){
            @Override
            public void run(){
                int counter = 10;

                while (counter > 0){
                    System.out.println(counter);
                    counter--;
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                
                System.out.println(counter);
                System.out.println("Bomb");
            }
        }.start();
    }
}
