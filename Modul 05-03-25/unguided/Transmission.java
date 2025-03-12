/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Transmission untuk menangani sistem perpindahan gigi
public class Transmission {
    String type;
    int gearCount;

    // Menampilkan pesan bahwa transmisi sedang berpindah ke gigi tertentu.
    void changeGear(int gear) {
        System.out.println("Changing to gear " + gear);
    }
}
