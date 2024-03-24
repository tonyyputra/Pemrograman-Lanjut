package projectObject;
import java.util.Scanner;
import projectClass.clsLingkaran;

public class objLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clsLingkaran lingA = new clsLingkaran();
        System.out.println("Program menghitung luas dan keliling Lingkaran");
        System.out.println("Masukkan nilai jari-jari!");

        lingA.jari = input.nextInt();
        System.out.println("Luas Lingkaran :" + lingA.getLuas());
        System.out.println("Keliling Lingkaran : " + lingA.getKeliling());

        clsLingkaran lingB = new clsLingkaran();
        System.out.println("Luas Lingkaran :" + lingB.getLuas());
        System.out.println("Keliling Lingkaran : " + lingB.getKeliling());

        input.close();
    }
}
