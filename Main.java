/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BrainNeeded.Laundry;

import java.util.Scanner;

/**
 *
 * @author akmal
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Client client = new Client();
        Transaksi transaksi = new Transaksi();

        Boolean exit = false;

        while (!exit) {

            System.out.println("--- SELAMAT DATANG ---");
            System.out.print("Login sebagai client/petugas : ");
            String login = scan.next();

            if (login.equalsIgnoreCase("client")) {

                client.Tampilkan();
                System.out.print("Apakah anda terdaftar dalam member y/n : ");
                String member = scan.next();

                if (member.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan ID : ");
                    int idClient = scan.nextInt();

                    System.out.println(" ");
                    System.out.println("Masukkan jenis laundry : ");
                    System.out.println("1. cuci kering + setrika");
                    System.out.println("2. cuci kering");
                    System.out.print("pilihan : ");
                    int pilihan = scan.nextInt();

                    System.out.print("Masukkan jumlah (per-5kg) : ");
                    int banyak = scan.nextInt();

                    transaksi.laporan(client, idClient, banyak, pilihan);
                }

                if (member.equalsIgnoreCase("n")) {
                    System.out.println("Daftarkan diri anda : ");
                    client.Tambahkan();
                }

            } else {

                System.out.println("Main Menu : ");
                System.out.println("1. Tambahkan Client");
                System.out.println("2. Tampilkan Client");
                System.out.println("3. Topup saldo");
                System.out.print("Pilihan : ");
                String pilihan = scan.next();

                switch (pilihan) {

                    case ("1") -> {
                        client.Tambahkan();
                    }
                    case ("2") -> {
                        client.Tampilkan();
                    }
                    case ("3") -> {
                        System.out.println("--------------------");
                        System.out.print("Masukkan ID : ");
                        int idClient = scan.nextInt();
                        System.out.print("Masukkan jumlah topup : ");
                        int input = scan.nextInt();

                        client.tambahSaldo(idClient, input);
                    }
                }

            }
        }

    }
}
