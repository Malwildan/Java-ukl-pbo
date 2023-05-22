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
public class Transaksi {
    
    Scanner scan = new Scanner (System.in);
    
    private ArrayList<Integer> idClient = new ArrayList<>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();
    
    JenisLaundry jenislaundry = new JenisLaundry();
    
    public void laporan (Client client, int idClient, int banyak, int pilihan) {
        
        this.idClient.add(idClient);
    
        this.banyak.add(banyak);
        
        String namaClient = client.getNamaClient(idClient);
        String alamat = client.getAlamat(idClient);
        String telepon = client.getTelepon(idClient);
        int saldo = client.getSaldo(idClient) - (jenislaundry.getHarga(pilihan - 1) * banyak);
        client.editSaldo(idClient, saldo);
        
        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println("RECEIPT");
        System.out.println("---------------------");
        System.out.println("Nama: " + namaClient);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
        System.out.println("jenis laundry : "+jenislaundry.getJenisLaundry(pilihan - 1));
        System.out.println("Saldo : " + client.getSaldo(idClient));
        System.out.println(" ");
        
        
    }
    

    public ArrayList<Integer> getIdClient() {
        return idClient;
    }

    public void setIdClient(ArrayList<Integer> idClient) {
        this.idClient = idClient;
    }

    public ArrayList<Integer> getIdJenisLaundry() {
        return idJenisLaundry;
    }

    public void setIdJenisLaundry(ArrayList<Integer> idJenisLaundry) {
        this.idJenisLaundry = idJenisLaundry;
    }

    public ArrayList<Integer> getBanyak() {
        return banyak;
    }

    public void setBanyak(ArrayList<Integer> banyak) {
        this.banyak = banyak;
    }
    
}
