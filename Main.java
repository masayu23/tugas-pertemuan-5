public class Main {

    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Masayu", 12345, 'C', 3.45, 20, "Teknik Informatika");
        mahasiswa mhs2 = new mahasiswa("Berliana",3564,'C',3.75, 21, "Teknik Informatika");
 
         // mhs1.nama = "masayu";
         // mhs1.nim = 12345;
         // mhs1.kelas = 'A';
         // mhs1.ipk = 90.5;
 
         // // Mengisi data untuk mahasiswa kedua
         // mhs2.nama = "adinda";
         // mhs2.nim = 67890;
         // mhs2.kelas = 'B';
         // mhs2.Ipk = 85.0;

         System.out.println("Data Mahasiswa 1:");
         mhs1.tampildata();
         mhs1.Alamat("Jl. Sudirman No. 123");
         System.out.println("Prediksi Tahun Lulus: " + mhs1.prediksitahunlulus(2023));
         System.out.println("Usia pada Tahun 2025: " + mhs1.hitungusiapadatahun(2025));
         System.out.println();
 
         System.out.println();

         System.out.println("Data Mahasiswa 2:");
        mhs2.tampildata();
        mhs2.Alamat("Jl. Thamrin No. 456");
        System.out.println("Prediksi Tahun Lulus: " + mhs2.prediksitahunlulus(2023));
        System.out.println("Usia pada Tahun 2025: " + mhs2.hitungusiapadatahun(2025));
     }
 }