public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Intifada", "NIK001", "Keuangan", "Manajer", 25000000);
        Pegawai pegawai2 = new Pegawai("Dedi", "NIK002", "IT", "Staff", 5000000);

        pegawai1.tampilkanData();
        System.out.println();
        pegawai2.tampilkanData();

        double bonusPegawai1 = pegawai1.hitungBonus(10);
        System.out.println("Bonus " + pegawai1.nama + ": " + bonusPegawai1);

        pegawai2.perbaruiGaji(5500000);
        System.out.println("Gaji " + pegawai2.nama + " setelah diperbarui: " + pegawai2.gaji);

        pegawai1.ubahPosisi("Direktur");
        pegawai1.tampilkanData();

        String divisiPegawai2 = pegawai2.getDivisi();
        System.out.println("Divisi " + pegawai2.nama + ": " + divisiPegawai2);
    }
}