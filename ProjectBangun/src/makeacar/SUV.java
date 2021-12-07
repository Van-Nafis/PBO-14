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
public class SUV extends Abstract{
    //atribut
    public double konsumsi = 12;
    public double destinasi1 = 656;
    public double destinasi2 = 527;
    public double kec1 = 57;
    public double kec2 = 62;
    
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
        System.out.println("SUV C");
        System.out.println("Bahan bakar minimal ke Banten : " + bahanBakarMinimal1() + " Liter");
        System.out.println("Lama perjalanan ke Banten : "+lamaPerjalanan1());
        System.out.println("======================================================");
        System.out.println("SUV D");
        System.out.println("Bahan bakar minimal ke Bandung : " + bahanBakarMinimal2() + " Liter");
        System.out.println("Lama perjalanan ke Bandung : "+lamaPerjalanan2());

    }
}
