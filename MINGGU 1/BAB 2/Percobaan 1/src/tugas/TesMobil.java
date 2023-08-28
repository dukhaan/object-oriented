/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Dukhaan
 */
public class TesMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("mobil1", "Toyota", "Biru", "minibus", 2000, 7);
        Mobil mobil2 = new Mobil("mobil2", "Daihatsu", "Hitam", "pick up", 1500, 2);
        Mobil mobil3 = new Mobil("mobil3", "Suzuki", "Silver", "suv", 1800, 5);
        Mobil mobil4 = new Mobil("mobil4", "Honda", "Merah", "sedan", 1300, 5);
        
        // Menampilkan info karakteristik mobil
        System.out.println("Info Mobil 1:");
        mobil1.infoMobil();
        
        System.out.println("\nInfo Mobil 2:");
        mobil2.infoMobil();
        
        System.out.println("\nInfo Mobil 3:");
        mobil3.infoMobil();
        
        System.out.println("\nInfo Mobil 4:");
        mobil4.infoMobil();
    }
}