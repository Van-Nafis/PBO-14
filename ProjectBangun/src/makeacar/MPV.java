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
public class MPV extends Abstract{
    //atribut
    public double konsumsi = 14;
    public double destinasi1 = 541;
    public double destinasi2 = 433;
    public double kec1 = 64;
    public double kec2 = 53;
    
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
        System.out.println("MPV E");
        System.out.println("Bahan bakar minimal ke Banyuwangi : " + bahanBakarMinimal1() + " Liter");
        System.out.println("Lama perjalanan ke Banyuwangi : "+lamaPerjalanan1());
        System.out.println("======================================================");
        System.out.println("MPV F");
        System.out.println("Bahan bakar minimal ke Jember : " + bahanBakarMinimal2() + " Liter");
        System.out.println("Lama perjalanan ke Jember : "+lamaPerjalanan2());

    }
}
