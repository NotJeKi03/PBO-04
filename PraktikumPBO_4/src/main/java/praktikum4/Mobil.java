/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author notjeki03
 */
public class Mobil extends Kendaraan0 {
    private int jumlahPintu;
    
    //constructor
    public Mobil(String name, int maxSpeed, String engineType, int jumlahPintu) {
        super(name, maxSpeed, engineType); //memanggil constructor dari kelas induk(kendaraan)
        this.jumlahPintu = jumlahPintu;
    }

    
    //method menampilkan informasi mobil
    public void showInfo() {
        System.out.println("kecepatan maks mobil : " + maxSpeed + "km/h");
        System.out.println("jumlah pintu : " + jumlahPintu);
        
    }
}
