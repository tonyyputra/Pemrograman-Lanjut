import java.util.Scanner;

import projectClass.clsMobil;

public class objMobil {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    clsMobil[] ClsMobil = new clsMobil[5];
    int count = 0;
    boolean looping = true;

    System.out.println();
    System.out.println("<SELAMAT DATANG DI SEWA MOBIL>"); 
    System.out.println("==============================");

    while (looping){
        System.out.println();
        System.out.println("Silahkan pilih opsi berikut untuk lanjut: ");
        System.out.println("1.Menambahkan Mobil");
        System.out.println("2.Tampilkan Mobil Sewaan");
        System.out.println("3.Akhiri Pengisian Data Mobil");

        System.out.print("Masukkan pilihan (1/2/3): ");
        int option = input.nextInt();


    if (option == 1){
        input.nextLine();
        System.out.println();
        System.out.println("<PENGISIAN DATA MOBIL>");
        System.out.println("======================");
        
        System.out.print("Masukkan No. Plat Mobil! : ");
        String noPlat = input.nextLine();
        System.out.print("Masukkan Merek Mobil! : ");
        String merekMobil = input.nextLine(); 
        System.out.print("Masukkan Warna Mobil! : ");
        String warnaMobil = input.nextLine();
        System.out.print("Masukkan Tahun Keluaran Mobil! : ");
        int tahunKeluaranMobil = input.nextInt(); 
        
        ClsMobil[count] = new clsMobil(
            noPlat, 
            merekMobil, 
            warnaMobil, 
            tahunKeluaranMobil
        );
        count++;
        
    } else if (option == 2){
        for (int i = 0; i<count;i++){
            ClsMobil[i].tampilkanMobil();
        }
        System.out.println("======================================");
        
        } else if (option == 3){
            looping = false;
    
            input.close();
            }
        }
    }
}