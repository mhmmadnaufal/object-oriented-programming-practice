/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class Dimensi untuk menyimpan ukuran mobil
public class Dimensi {
    int length; // dalam mm
    int width; // dalam mm
    int height; // dalam mm
    int wheelbase; // jarak sumbu roda dalam mm

    // Menampilkan informasi lengkap tentang dimensi kendaraan, termasuk panjang, lebar, tinggi, dan jarak sumbu roda.
    void dimensionInfo() {
        System.out.println("Dimensions: " + length + " mm x " + width + " mm x " + height + " mm");
        System.out.println("Wheelbase: " + wheelbase + " mm");
    }
}

