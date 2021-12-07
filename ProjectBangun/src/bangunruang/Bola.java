/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Acer
 */
public class Bola extends BangunRuang{
    // atribut
    public double r;
    
    // method
    public double hitungVolume(){
        double volume = 1.33333 * Math.PI * r * r * r;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        double luasPermukaan = 4 * Math.PI * r * r;
        return luasPermukaan;
    }     
}
