/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan.pkg1;

/**
 *
 * @author Dukhaan
 */

public class Percobaan3 {

    public static void main(String args[]) {
        Siswa anak = new Siswa(5);
        System.out.println("NRP: " + anak.getNrp());
        
        anak.setNrp(10);
        System.out.println("NRP setelah diubah :" + anak.getNrp());
        
        anak.setNama("Dukhaan");
        System.out.println("Anak dengan NRP " + anak.getNrp() + " adalah " + anak.nama);
    }
}

//public class Percobaan1 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        System.out.println("hal");
//    }
//    
//}
