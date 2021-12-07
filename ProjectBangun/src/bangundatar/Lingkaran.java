/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Acer
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double r;
    
    //method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = Math.PI * this.r * this.r;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * this.r;
        return keliling;
    }
        
}
