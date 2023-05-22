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
public class Petugas implements Interface{

    private ArrayList<String> namaPetugas = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Integer> jabatan = new ArrayList<>();
    
    public Petugas() {
        
    /* */ 
        
    //petugas 1    
    namaPetugas.add("Bob");
    alamat.add("Sulfat");
    telepon.add("123-456-7890");
    jabatan.add(1);

    //petugas 2
    namaPetugas.add("John");
    alamat.add("Danau Ranau");
    telepon.add("987-654-3210");
    jabatan.add(2);
    
    //petugas 3
    namaPetugas.add("Alex");
    alamat.add("Merpati");
    telepon.add("555-123-4567");
    jabatan.add(1);
        
    }

    @Override
    public void Tampilkan() {
        System.out.println("--------------------");
        System.out.println("Daftar Petugas : ");
        System.out.println("--------------------");
        
        System.out.println("ID  \tNama  \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < namaPetugas.size(); i++){
            System.out.println(i+ "\t" + namaPetugas.get(i) + "\t" + alamat.get(i) + "\t" + telepon.get(i) + "\t" + getJabatan(i));
            
        }
        System.out.println("====================");
    }
    
    

    public ArrayList<String> getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(ArrayList<String> namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public ArrayList<String> getTelepon() {
        return telepon;
    }

    public void setTelepon(ArrayList<String> telepon) {
        this.telepon = telepon;
    }

    public Integer getJabatan(int id) {
        return jabatan.get(id);
    }

    public void setJabatan(ArrayList<Integer> jabatan) {
        this.jabatan = jabatan;
    }

}
