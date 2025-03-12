/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Car untuk menyimpan informasi dasar mengenai mobil
public class Car {
    String brand;
    String model;
    int year;
    int doors;
    int seats;

    // Menampilkan pesan bahwa mobil dinyalakan.
    void startCar() {
        System.out.println("Starting the car: " + brand + " " + model); 
    }

    // Menampilkan pesan bahwa mobil dimatikan.
    void stopCar() {
        System.out.println("Stopping the car: " + brand + " " + model);
    }

    // Menampilkan informasi lengkap tentang mobil, termasuk merek, model, tahun produksi, jumlah pintu, dan jumlah kursi.
    void carInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Year: " + year);
        System.out.println("Doors: " + doors);
        System.out.println("Seats: " + seats);
    }
}
