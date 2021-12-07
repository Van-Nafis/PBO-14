/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeacar;


/**
 *
 * @author Acer
 */
public class MainClass {
    public static void main(String[] args){
        Sedan sedan = new Sedan();
        sedan.tampil();
        
        SUV suv = new SUV();
        suv.tampil();
        
        MPV mpv = new MPV();
        mpv.tampil();
        
    }
}
