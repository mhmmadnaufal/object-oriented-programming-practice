/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Ban untuk menyimpan informasi tentang ban mobil
public class Ban {
    String brand;
    String type;
    int size; // in inches
    double price; // in rupiah

    // Menampilkan informasi merek, jenis, ukuran, dan harga ban.
    void banInfo() {
        System.out.println("Ban: " + brand + ", type: " + type);
        System.out.println("Size: " + size + " inches");
        System.out.println("Price: Rp " + price);
    }
}


