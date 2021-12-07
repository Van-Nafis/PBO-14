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
public class Sedan extends Abstract{
    //atribut
    public double konsumsi = 10;
    public double destinasi1 = 102;
    public double destinasi2 = 538;
    public double kec1 = 60;
    public double kec2 = 65;
    
    //method
    public double bahanBakarMinimal1(){
        double minimal1 = (destinasi1 / konsumsi);
        return minimal1;
    }
    
    public double bahanBakarMinimal2(){
        double minimal2 = (destinasi2 / konsumsi);
        return minimal2;
    }
    
    public String lamaPerjalanan1(){
        double waktu = (destinasi1 / kec1);
        int jam = (int) waktu;
        int menit = (int) (waktu * 60) % 60;
        return String.format("%s jam %s menit", jam, menit);
    }
        
    public String lamaPerjalanan2(){
        double waktu = (destinasi2 / kec2);
        int jam = (int) waktu;
        int menit = (int) (waktu * 60) % 60;
        return String.format("%s jam %s menit", jam, menit);
    }
    
    public void tampil(){
        System.out.println("======================================================");
        System.out.println("Sedan A");
        System.out.println("Bahan bakar minimal ke Kudus : " + bahanBakarMinimal1() + " Liter");
        System.out.println("Lama perjalanan ke Kudus : "+lamaPerjalanan1());
        System.out.println("======================================================");
        System.out.println("Sedan B");
        System.out.println("Bahan bakar minimal ke Jakarta : " + bahanBakarMinimal2() + " Liter");
        System.out.println("Lama perjalanan ke Jakarta : "+lamaPerjalanan2());

    }
}
