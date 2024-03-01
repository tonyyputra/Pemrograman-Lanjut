package Objek;

import java.util.Scanner;

import Kelas.clsLingkaran;
public class objLingkaran {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);

        clsLingkaran lingA = new clsLingkaran();
        System.out.println("Program menghitung luas dan keliling Lingkaran");
        System.out.println("Masukkan nilai jari-jari!");

        lingA.jari = sc.nextInt();

        System.out.println("Luas Lingkaran :" + lingA.getLuas());
    }
}
