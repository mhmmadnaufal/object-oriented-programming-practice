/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Engine untuk informasi mesin mobil
public class Engine {
    String type;
    int horsepower;

    //  Menampilkan pesan bahwa mesin dengan jenis tertentu dan daya tertentu telah dinyalakan.
    void startEngine() {
        System.out.println("Engine " + type + " with " + horsepower + " HP started.");
    }

    // Menampilkan pesan bahwa mesin dengan jenis tertentu telah dimatikan
    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}


