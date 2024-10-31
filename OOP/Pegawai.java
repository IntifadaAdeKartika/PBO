public class Pegawai {
    String nama;
    String NIK; // Nomor Induk Karyawan
    String divisi;
    String posisi;
    double gaji;

    public Pegawai(String nama, String NIK, String divisi, String posisi, double gaji) {
        this.nama = nama;
        this.NIK = NIK;
        this.divisi = divisi;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + NIK);
        System.out.println("Divisi: " + divisi);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji: " + gaji);
    }

    public double hitungBonus(double persentaseBonus) {
        return gaji * persentaseBonus / 100;
    }

    public void perbaruiGaji(double gajiBaru) {
        this.gaji = gajiBaru;
    }

    public void ubahPosisi(String posisiBaru) {
        this.posisi = posisiBaru;
        System.out.println("Posisi pegawai " + nama + " telah diubah menjadi: " + posisiBaru);
    }

    public String getDivisi() {
        return divisi;
    }
}