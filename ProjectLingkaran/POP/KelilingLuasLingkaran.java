package POP;

import java.util.Scanner;

public class KelilingLuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double phi, luas, keliling, jari;

        phi = 3.14;
        
        System.out.println("Masukkan jari-jari lingkaran!");
        jari = input.nextInt();

        luas = phi * jari * jari;
        keliling = 2 * phi * jari;

        System.out.printf("Luas Lingkaran = %.2f cm%n" , luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n" ,keliling);

        input.close();
    }
}

