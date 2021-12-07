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
public class PersegiPanjang extends BangunDatar{
    // atribut panjang dan lebar
    public double Panjang;
    public double Lebar;
    
    //method untuk hitung luas persegi panjang
    public double hitungLuas(){
        double luas = this.Panjang * this.Lebar;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * (this.Panjang + this.Lebar);
        return keliling;
    }    
}
