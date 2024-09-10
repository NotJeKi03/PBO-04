/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak4;

/**
 *
 * @author notjeki03
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        //menambahkan attribut gaji
        this.gaji = gaji;
    }
    
    //getter & setter untuk gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    //method menampilkan info
    public void showInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Usia        : " + usia + "tahun");
        System.out.println("Pekerjaan   : " + pekerjaan);
        System.out.println("Gaji        : Rp " + gaji);
    }
}
