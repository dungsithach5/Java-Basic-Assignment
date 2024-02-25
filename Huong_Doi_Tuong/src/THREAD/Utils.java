/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author tainguyen
 */
public class Utils {
    
    public synchronized static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
