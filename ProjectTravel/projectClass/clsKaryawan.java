public class clsKaryawan {
        private String nama;
        private String alamat;
        private String noTelp;
        private String jenisKelamin;
        private String kategoriKaryawan;
        
        public clsKaryawan(){
        }
        
        public clsKaryawan(String nama, String alamat, String noTelp, 
        String jenisKelamin, String kategoriKaryawan) {
    
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKelamin = jenisKelamin;
        this.kategoriKaryawan = kategoriKaryawan;
        }
        
        public void tampilkanDataKaryawan (){
         System.out.println();
         System.out.printf("Nama             : %s\n", this.nama);
         System.out.printf("Alamat           : %s\n", this.alamat); 
         System.out.printf("No. Telp         : %s\n", this.noTelp);
         System.out.printf("Jenis Kelamin    : %s\n", this.jenisKelamin);
         System.out.printf("Kategori Karyawan: %s\n", this.kategoriKaryawan);
         System.out.printf("============================== \n");
    }
}
   