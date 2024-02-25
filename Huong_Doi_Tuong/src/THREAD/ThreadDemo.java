/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

/**
 *
 * @author tainguyen
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        ThreadSumNumber t1 = new ThreadSumNumber(10);
//        System.out.println(t1.getName());
//        t1.start();
//        
//        RunnableSumNumber runnableSumNumber = new RunnableSumNumber(20);
//        Thread t2 = new Thread(runnableSumNumber, "ABC");
//        System.out.println(t2.getName());
//        t2.start();
//        
//        try{
//            t1.join();
//            t2.join();
//        } catch(Exception e) {}

        ThreadPrime t3 = new ThreadPrime(100, "prime1");
        t3.start();
        ThreadPrime t4 = new ThreadPrime(100, "prime2");
        t4.start();
        
        System.out.println("Main end!!!!!!");
    }
}
