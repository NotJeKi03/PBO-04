/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author notjeki03
 */
public class Kendaraan0 {
    private String  name;       //Hanya bisa diakses dalam kelas ini(Kendaraan)
    protected int maxSpeed;     //Bisa diakses dalam package yang sam
    public String engineType;   //Bisa diakses dimana saja
    
    //constructor
    public Kendaraan0(String name, int maxSpeed, String engineType) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }
    
    //getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //Method public untuk menampilkan kendaraan
    public void showInfo() {
        System.out.println("name        : " + name);
        System.out.println("max speed   : " + maxSpeed + "km/h");
        System.out.println("engine type : " + engineType);
    }
}
