public class mahasiswa {
    String nama;
    int nim;
    char kelas;
    double ipk;
    int umur;       
    String jurusan;   

    public mahasiswa(String nama, int nim, char kelas, double ipk, int umur, String jurusan) { 
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public mahasiswa() {
    }

    public void tampildata() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
        System.out.println("Umur : " + umur);
        System.out.println("Jurusan : " + jurusan);
    }

    public void Alamat(String alamatmhs) {
        System.out.println("Alamat : " + alamatmhs);
    }

    public int prediksitahunlulus(int tahunMasuk) {
        return tahunMasuk + 4;
    }

    public double getipk() {
        return ipk;
    }

    public int hitungusiapadatahun(int tahunsekarang) {
        int tahunlahir = tahunsekarang - umur;
        return tahunsekarang - tahunlahir;
    }

    public String getjurusan() {
        return jurusan;
    }

    public void setumur(int umur) {
        this.umur = umur;
    }
}