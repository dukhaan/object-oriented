package latihan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dukhaan
 */
public class Truk {
    double muatan;
    double muatanmaks;
    
    Truk(double beratmaks){
        muatanmaks = beratmaks;
    }
    
    double getMuatan(){
        return muatan;
    };
    
    double getMuatanMaks(){
        return muatanmaks;
    }
    
    double tambahMuatan(double berat){
        return muatan+berat <= muatanmaks ? muatan += berat : muatan;
    }
}
