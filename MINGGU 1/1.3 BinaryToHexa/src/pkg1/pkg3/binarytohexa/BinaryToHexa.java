/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg3.binarytohexa;
import java.util.Scanner;

/**
 *
 * @author Dukhaan
 */
public class BinaryToHexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka, i = 0;
        int heksa[] = new int[100];
        char heksaChar[] = new char[100];
        
        System.out.println("Selamat datang di Program Konversi Bilangan Desimal ke Heksadesimal");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        angka = input.nextInt();
        
        while (angka != 0) {
            heksa[i] = angka % 16;
            angka /= 16;
            i++;
        }
        
        for (int j = i - 1; j >= 0; j--) {
            if (heksa[j] < 10) {
                heksaChar[j] = (char) (heksa[j] + '0');
            } else {
                heksaChar[j] = (char) (heksa[j] - 10 + 'A');
            }
        }
        
        System.out.print("Nilai heksadesimalnya adalah: ");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(heksaChar[j]);
        }
        System.out.println();
    }
    
}
