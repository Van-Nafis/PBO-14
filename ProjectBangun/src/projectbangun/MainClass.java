/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author Acer
 */
public class MainClass {
    public static void main(String[] args){     
        Persegi p1 = new Persegi();
        p1.sisi = 5;
        p1.tampilHasil();
        
        Lingkaran l1 = new Lingkaran();
        l1.r = 7;
        p1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.Lebar = 5;
        pp1.Panjang = 6;
        pp1.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.r = 7;
        t1.t = 5;
        t1.tampilHasil();
        
        Balok b1 = new Balok();
        b1.l = 2;
        b1.p = 3;
        b1.t = 5;
        b1.tampilHasil();
        
        Bola bo1 = new Bola();
        bo1.r = 7;
        bo1.tampilHasil();
    }
}
