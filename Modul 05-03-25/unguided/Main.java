/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hype
 */
// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek car pertama
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Agya";
        car1.year = 2025;
        car1.doors = 4;
        car1.seats = 5;
        // Membuat objek car kedua
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic Nouva";
        car2.year = 1987;
        car2.doors = 2;
        car2.seats = 4;

        // Membuat objek fuel tank
        FuelTank fuelTank1 = new FuelTank();
        fuelTank1.capacity = 33; // Kapasitas tangki bahan bakar dalam liter
        FuelTank fuelTank2 = new FuelTank();
        fuelTank2.capacity = 45; // Kapasitas tangki bahan bakar dalam liter

        // Membuat objek engine
        Engine engine1 = new Engine();
        engine1.type = "Bensin 1.2L";
        engine1.horsepower = 87; // Tenaga dalam hp
        Engine engine2 = new Engine();
        engine2.type = "Bensin 1.5L D15B";
        engine2.horsepower = 108; // Tenaga dalam hp

        // Membuat objek transmission
        Transmission transmission1 = new Transmission();
        transmission1.type = "Manual";
        transmission1.gearCount = 5;
        Transmission transmission2 = new Transmission();
        transmission2.type = "Manual";
        transmission2.gearCount = 5;

        // Membuat objek velg
        Velg velg1 = new Velg();
        velg1.size = 14; // Ukuran velg dalam inci
        velg1.material = "Stainless Steel";
        Velg velg2 = new Velg();
        velg2.size = 15;
        velg2.material = "Alloy";

        // Membuat objek ban
        Ban ban1 = new Ban();
        ban1.brand = "Dunlop";
        ban1.type = "Radial";
        ban1.size = 14; // Ukuran ban dalam inci
        ban1.price = 1200000; // Harga dalam rupiah
        Ban ban2 = new Ban();
        ban2.brand = "Michelin";
        ban2.type = "Radial";
        ban2.size = 15; // Ukuran ban dalam inci
        ban2.price = 1800000; // Harga dalam rupiah

        // Membuat objek dimensi
        Dimensi dimensi1 = new Dimensi();
        dimensi1.length = 3760; // Panjang dalam mm
        dimensi1.width = 1665;  // Lebar dalam mm
        dimensi1.height = 1505; // Tinggi dalam mm
        dimensi1.wheelbase = 2525; // Jarak sumbu roda dalam mm
        Dimensi dimensi2 = new Dimensi();
        dimensi2.length = 3965; // Panjang dalam mm
        dimensi2.width = 1666; // Lebar dalam mm
        dimensi2.height = 1331; // Tinggi dalam mm
        dimensi2.wheelbase = 2500; // Jarak sumbu roda dalam mm

        // Membuat objek aki
        Aki aki1 = new Aki();
        aki1.brand = "GS Astra";
        aki1.capacity = 45; // Kapasitas aki dalam Ah
        aki1.type = "MF AGM";
        Aki aki2 = new Aki();
        aki2.brand = "Yuasa";
        aki2.capacity = 55;
        aki2.type = "Basah";

        
        // Menampilkan informasi mobil pertama (Toyota Agya)
        System.out.println("\n==== Informasi Mobil Pertama ====");
        car1.carInfo();
        dimensi1.dimensionInfo();
        fuelTank1.fuelInfo();
        velg1.velgInfo();
        ban1.banInfo();
        aki1.akiInfo();
        // Menyalakan mobil dan mesin
        car1.startCar();
        engine1.startEngine();
        transmission1.changeGear(1);
        // Mematikan mobil dan mesin
        car1.stopCar();
        engine1.stopEngine();
        
        // Menampilkan informasi mobil kedua (Honda Civic Nouva)
        System.out.println("\n==== Informasi Mobil Kedua ====");
        car2.carInfo();
        dimensi2.dimensionInfo();
        fuelTank2.fuelInfo();
        velg2.velgInfo();
        ban2.banInfo();
        aki2.akiInfo();
        // Menyalakan mobil dan mesin
        car2.startCar();
        engine2.startEngine();
        transmission2.changeGear(1);
        // Mematikan mobil dan mesin
        car2.stopCar(); 
        engine2.stopEngine(); 
    }
}
