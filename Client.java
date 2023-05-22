/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BrainNeeded.Laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akmal
 */
public class Client implements Interface {
    
    Scanner scan = new Scanner (System.in);
    
    private ArrayList<String> namaClient = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Integer> saldo = new ArrayList<>();
    
    public Client () {
        
        //client 1   
        namaClient.add("Ariana");
        alamat.add("Sulfat");
        telepon.add("123-456-7890");
        saldo.add(100_000);

        //client 2
        namaClient.add("Baskara");
        alamat.add("Bimasakti");
        telepon.add("987-654-3210");
        saldo.add(200_000);
    
        //client 3
        namaClient.add("Nadin");
        alamat.add("Merpati");
        telepon.add("555-123-4567");
        saldo.add(150_000);
    }
    
    @Override
    public void Tambahkan() {
        System.out.println("====================");
        System.out.print("Masukkan Nama : ");
        String namaClient = scan.next();
        this.namaClient.add(namaClient);
        System.out.print("Masukkan Alamat : ");
        String alamat = scan.next();
        this.alamat.add(alamat);
        System.out.print("Masukkan Telepon : ");
        String telepon = scan.next();
        this.telepon.add(telepon);
        System.out.print("Masukkan Saldo : ");
        int saldo = scan.nextInt();
        this.saldo.add(saldo);
    }
    
    @Override
    public void Tampilkan() {
        System.out.println("--------------------");
        System.out.println("Daftar Member : ");
        System.out.println("--------------------");
        
        System.out.println("ID  \tNama  \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < namaClient.size(); i++){
            System.out.println(i+ "\t" + namaClient.get(i) + "\t" + alamat.get(i) + "\t" + telepon.get(i) + "\t" + getSaldo(i));
            
        }
        System.out.println("====================");
    
    }
    
    public void tambahSaldo(int id, int input) {
    this.saldo.set(id, saldo.get(id) + input);
    }

    public String getNamaClient(int id) {
        return namaClient.get(id);
    }

    public void setNamaClient(ArrayList<String> namaClient) {
        this.namaClient = namaClient;
    }

    public String getAlamat(int id) {
        return alamat.get(id);
    }

    public void setAlamat(ArrayList<String> alamat) {
        this.alamat = alamat;
    }

    public String getTelepon(int id) {
        return telepon.get(id);
    }

    public void setTelepon(ArrayList<String> telepon) {
        this.telepon = telepon;
    }

    public int getSaldo(int id) {
        return saldo.get(id);
    }

    public void editSaldo(int id, int saldo) {
        this.saldo.set(id, saldo);
    }
    
    
}
