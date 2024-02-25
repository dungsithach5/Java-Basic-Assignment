/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author tainguyen
 */
public class RunnableSumNumber implements Runnable{

    private int num;
    
    public RunnableSumNumber(int num) {
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
        
        System.out.println("Runnable - Sum from 1 to " + num + " = " + sum);
    }
    
}
