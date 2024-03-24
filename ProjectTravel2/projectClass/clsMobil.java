package projectClass;

public class clsMobil {
    private String noPlat;
    private String merekMobil;
    private String warnaMobil;
    private int tahunKeluaranMobil;

    public clsMobil(){
    }

    public clsMobil(String noPlat, String merekMobil, String warnaMobil, int tahunKeluaranMobil) {
        this.noPlat = noPlat;
        this.merekMobil = merekMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaranMobil = tahunKeluaranMobil;
    }

    public void tampilkanMobil(){
        System.out.println();
        System.out.printf("Nomor Plat Mobil     : %s \n", this.merekMobil);
        System.out.printf("Merek Mobil          : %s \n", this.noPlat);
        System.out.printf("Warna Mobil          : %s \n", this.warnaMobil); 
        System.out.printf("Tahun Keluaran Mobil : %s \n", this.tahunKeluaranMobil);
        System.out.printf("================================= \n");
        }
    }