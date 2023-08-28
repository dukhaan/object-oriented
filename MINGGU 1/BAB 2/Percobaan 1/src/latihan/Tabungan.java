package latihan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dukhaan
 */
public class Tabungan {
    public int saldo;
    
    
    Tabungan (int initsaldo){
        saldo = initsaldo;
    }
    
    public int ambilUang (int jumlah){
        return saldo -= jumlah;
    }
}
