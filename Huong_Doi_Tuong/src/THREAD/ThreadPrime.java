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
public class ThreadPrime extends Thread{
    private int num;
    
    public ThreadPrime(int num, String threadName) {
        super(threadName);
        this.num = num;
    }

    @Override
    public void run() {
        
        for (int i = 1; i <= num; i++) {
            if (Utils.isPrimeNumber(i)) {
                System.out.println(getName() + ": " + i);
            }
        }
    }
    
}
