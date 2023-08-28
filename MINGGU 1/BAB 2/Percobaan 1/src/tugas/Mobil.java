/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Dukhaan
 */
public class Mobil {
    public String id;
    public String nama;
    public String warna;
    public String tipe;
    public int harga;
    public int kuantitas;
    
    public Mobil(String idMobil, String namaMobil, String warnaMobil, String tipeMobil, int hargaMobil, int kuantitasMobil){
        this.id = idMobil;
        this.nama = namaMobil;
        this.warna = warnaMobil;
        this.tipe = tipeMobil;
        this.harga = hargaMobil;
        this.kuantitas = kuantitasMobil;
    }
    
    public void setId(String idMobil){
        id = idMobil;
    }
    
    public void setNama(String namaMobil){
        nama = namaMobil;
    }
    
    public void setWarna(String namaMobil){
        nama = namaMobil;
    }
    public void setTipe(String namaMobil){
        nama = namaMobil;
    }
    public void setHarga(String namaMobil){
        nama = namaMobil;
    }
    public void setKuantitas(String namaMobil){
        nama = namaMobil;
    }
    
     public void infoMobil() {
        System.out.println("ID Mobil: " + id);
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Tipe Mobil: " + tipe);
        System.out.println("Harga Mobil: " + harga);
        System.out.println("Kuantitas Mobil: " + kuantitas);
    }
    
    
    
}
