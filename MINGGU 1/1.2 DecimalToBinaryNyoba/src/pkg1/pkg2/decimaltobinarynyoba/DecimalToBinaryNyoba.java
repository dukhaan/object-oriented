/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg2.decimaltobinarynyoba;
import java.util.Scanner;

/**
 *
 * @author Dukhaan
 */
public class DecimalToBinaryNyoba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number,i=0;
        int binary[] = new int[100];
        
        System.out.println("Selamat datang di program konversi bilangan Desimal ke Biner");
        
        Scanner user_input = new Scanner(System.in);
        System.out.print("Masukkan angka desimal: ");
        number = user_input.nextInt();
        
        while(number!=0){
            binary[i] = number%2;
            number/=2;
            i++;
        }
        
        System.out.print("Binary valuenya adalah : ");
        for(int j=i-1;j>=0;j--){
            System.out.print(""+binary[j]);
        }
        
    }
    
}
