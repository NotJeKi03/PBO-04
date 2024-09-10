/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author notjeki03
 */
public class Main {
    /*public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);
        
        System.out.println("Merk  : " + mobil.getMerk());
        System.out.println("Model : " + mobil.getModel());
        System.out.println("Year  : " + mobil.getYear());
        
        //mengubah data
        mobil.setModel("Innova");
        mobil.setYear(2021);
        
        System.out.println("\nModel Baru : " + mobil.getModel());
        System.out.println("Year Baru  : " + mobil.getYear());
       
    }*/

    public static void main(String[] args) {
        Mobil mobil = new Mobil("Hilux", 200, "Diesel", 4);
        
        //nilai name harus dipanggil dengan method getName karena "private"
        System.out.println("nama mobil : " + mobil.getName()); 
        
        //nilai engineType dapat dipanggil langsung karena "public" 
        System.out.println("mesin : " + mobil.engineType);
        
        //menampilkan maxSpeed & jumlahPintu lewat method showInfo() pada subclass Mobil
        mobil.showInfo(); 
    }
}

