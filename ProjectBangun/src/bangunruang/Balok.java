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
public class Balok extends BangunRuang{
    // atribut
    public double p;
    public double l;
    public double t;
    
    // method
    public double hitungVolume(){
        double volume = p * l * t;
        return volume;
    }
    
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * (p*l + p*t + l*t);
        return luasPermukaan;
    }    
}
