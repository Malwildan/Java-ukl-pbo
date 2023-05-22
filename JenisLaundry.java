/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BrainNeeded.Laundry;

import java.util.ArrayList;

/**
 *
 * @author akmal
 */
public class JenisLaundry {
    
    private ArrayList<String> jenisLaundry = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();
    private ArrayList<Integer> durasi = new ArrayList<>();

    public JenisLaundry() {
        
    //cuci kering + setrika   
    jenisLaundry.add("cuci kering + setrika");
    harga.add(25_000);
    durasi.add(5);
    
    //cuci kering
    jenisLaundry.add("cuci kering");
    harga.add(15_000);
    durasi.add(3);
 
    }

    public String getJenisLaundry(int id) {
        return jenisLaundry.get(id);
    }

    public void setJenisLaundry(ArrayList<String> jenisLaundry) {
        this.jenisLaundry = jenisLaundry;
    }

    public int getHarga(int id) {
        return harga.get(id);
    }

    public void setHarga(ArrayList<Integer> harga) {
        this.harga = harga;
    }

    public ArrayList<Integer> getDurasi() {
        return durasi;
    }

    public void setDurasi(ArrayList<Integer> durasi) {
        this.durasi = durasi;
    }
    
    
    
}
