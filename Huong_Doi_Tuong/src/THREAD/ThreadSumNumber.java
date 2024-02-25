/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tainguyen
 */
public class ThreadSumNumber extends Thread{
    private int num;
    
    public ThreadSumNumber(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {}
        
        System.out.println("Thread - Sum from 1 to " + num + " = " + sum);
    }
    
}
