package projectObject;

import java.util.Scanner;

import projectClass.clsKaryawan;

public class objKaryawan {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    clsKaryawan[] ClsKaryawan = new clsKaryawan[5];
    int count = 0;
    boolean looping = true;

    System.out.println();
    System.out.println("<SELAMAT DATANG DI APK FILKOM TOUR>"); 
    System.out.println("===================================");

    while (looping){
        System.out.println();
        System.out.println("Silahkan pilih opsi berikut untuk lanjut: ");
        System.out.println("1.Menambah Data Karyawan");
        System.out.println("2.Tampilkan Data Karyawan");
        System.out.println("3.Akhiri Pengisian Data Karyawan");
        
        System.out.print("Masukkan pilihan (1/2/3): ");
        int option = input.nextInt();

    if (option == 1){
        input.nextLine();
        System.out.println();
        System.out.println("<PENGISIAN DATA KARYAWAN>");
        System.out.println("=========================");

        System.out.print("Masukkan Nama Karyawan! : ");
        String nama = input.nextLine(); 
        System.out.print("Masukkan Alamat Karyawan! : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan No. Telp Karyawan! : ");
        String noTelp = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin Karyawan! : ");
        String jenisKelamin = input.nextLine();
        System.out.print("Masukkan Kategori Karyawan! : ");
        String kategoriKaryawan = input.nextLine();

        ClsKaryawan [count] = new clsKaryawan(
            nama,
            alamat,
            noTelp,
            jenisKelamin,
            kategoriKaryawan
        );
        count++;

    } else if (option == 2){
        for (int i = 0; i<count;i++){
            ClsKaryawan[i].tampilkanDataKaryawan();
        }
        System.out.println("===================================");

    } else if (option == 3){
        looping = false;
    
        input.close();
            }
        }
    }
    
}