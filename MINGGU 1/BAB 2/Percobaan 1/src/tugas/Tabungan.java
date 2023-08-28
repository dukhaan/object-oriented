/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Dukhaan
 */
public class Tabungan {
    public int saldo;
    
    Tabungan(int initsaldo){
        saldo = initsaldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public int simpanUang(int jumlah){
        return saldo += jumlah;
    } 
    
    public boolean ambilUang(int jumlah){
        if(saldo>jumlah){
            saldo -= jumlah;
            return true;
        }
        return false;
    }
}
