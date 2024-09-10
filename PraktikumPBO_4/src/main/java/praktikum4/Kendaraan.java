/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author notjeki03
 */
public class Kendaraan {
    private String merk;
    private String model;
    private int year;
    
    
    //contructor
    public Kendaraan(String merk, String model, int year) {
        this.merk = merk;
        this.model = model;
        this.year = year;
    }
    
    //getter & setter
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
   
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
