/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci.dan.prima;

/**
 *
 * @author Dukhaan
 */
public class Fibonacci {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public void generateAngka() {
        int a = 0, b = 1, i = 0, temp;
        System.out.println("Deret Fibonacci:");
        for (i=0; i<n; i++) {
            System.out.print(a + " ");
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}
