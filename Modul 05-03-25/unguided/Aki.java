/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Aki untuk menyimpan informasi tentang aki mobil
public class Aki {
    String brand;
    int capacity; // dalam Ampere-hour (Ah)
    String type; // Basah, Kering, Hybrid, Kalsium, MF AGM

    // Menampilkan informasi merek, kapasitas, dan jenis aki.
    void akiInfo() {
        System.out.println("Aki: " + brand + ", capacity: " + capacity + "Ah, type: " + type);
    }
}

