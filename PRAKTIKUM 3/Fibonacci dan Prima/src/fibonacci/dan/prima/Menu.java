/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci.dan.prima;

import java.util.Scanner;

/**
 *
 * @author Dukhaan
 */
public class Menu {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        int n;
        do {
            System.out.println("SELAMAT DATANG DI MENU DERET FIBONACCI DAN PRIMA");
            System.out.println("1. Deret fibonacci");
            System.out.println("2. Deret Prima");

            System.out.print("Pilih menu yang ingin ditampilkan: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Silahkan masukkan angka: ");
            n = scanner.nextInt();
            

            if (choice == 1) {
                Fibonacci fibonacci = new Fibonacci(n);
                fibonacci.generateAngka();
            } else if (choice == 2) {
                Prima angkaPrima = new Prima(n);
                angkaPrima.generateAngka();
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }

            System.out.print("Apakah Anda ingin memilih menu lagi? (y/n): ");
            String continueChoice = scanner.next();
            if (continueChoice.equalsIgnoreCase("n")) {
                choice = 0;
            }
        } while (choice == 1);

        System.out.println("Terima kasih telah menggunakan program ini!");
        scanner.close();
    }
}

