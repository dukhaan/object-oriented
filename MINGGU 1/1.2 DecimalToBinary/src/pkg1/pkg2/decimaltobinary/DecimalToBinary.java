/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg2.decimaltobinary;
import java.util.Scanner;

/**
 *
 * @author Dukhaan
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int decimalNumber;
        String binaryNumber;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        decimalNumber = inputScanner.nextInt();

        binaryNumber = convertToBinary(decimalNumber);

        System.out.println("Hasil konversi ke biner: " + binaryNumber);
    }

    // Fungsi untuk mengkonversi bilangan bulat ke biner
    public static String convertToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0,remainder);
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }
}
