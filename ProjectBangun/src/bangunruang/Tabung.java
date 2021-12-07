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
public class Tabung extends BangunRuang{
    // atribut
    public double r;
    public double t;
    
    // method
    public double hitungVolume(){
        double volume = Math.PI * r * r * t;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * Math.PI * r * (r + t);
        return luasPermukaan;
    }
}
