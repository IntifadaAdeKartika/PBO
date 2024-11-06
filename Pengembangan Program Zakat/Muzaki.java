public class Muzaki {
    private String nama;
    private double harta;
    private String jenisHarta; // 1 = Uang Tunai 2 = Emas 3 = Perak

    public Muzaki(String nama, double harta, String jenisHarta) {
        this.nama = nama;
        this.harta = harta;
        this.jenisHarta = jenisHarta;
    }

    // Getter dan Setter untuk atribut Nama, Harta, dan jenisHarta
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
    }

    public String getJenisHarta() {
        return jenisHarta;
    }

    public void setJenisHarta(String jenisHarta) {
        this.jenisHarta = jenisHarta;
    }

    // Metode void tanpa parameter untuk menampilkan informasi Muzaki
    public void displayInfo() {
        System.out.printf("Nama Muzaki: %s\nJenis Harta: %s\nJumlah Harta: %.2f\n", nama, jenisHarta, harta);
    }

    // Metode dengan parameter dan return type untuk menghitung zakat jika mencapai nisab
    public double calculateZakat(double nisab) {
        if (harta >= nisab) {
            return harta * 0.025;
        } else {
            return 0; // Tidak perlu membayar zakat jika harta kurang dari nisab
        }
    }
}
