package Soal2;
import java.util.Scanner;

public class Soal2 {

    public static double hitungVolume(double jariJari, double tinggi) {
     
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Menghitung Volume Tabung ===");
        
        
        System.out.print("Masukkan jari-jari alas tabung (cm): ");
        double r = scanner.nextDouble();
        
        
        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = scanner.nextDouble();
        
        
        double hasilVolume = hitungVolume(r, t);
        
        
        System.out.println("\n=== HASIL ===");
        System.out.println("Volume tabung: " + hasilVolume + " cm³ ");
        
        scanner.close();
    }
} 





