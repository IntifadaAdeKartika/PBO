public class Muzaki {
    private String nama;
    private double harta;
    private String jenisHarta; // 1 = Uang, 2 = Emas, 3 = Perak

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
}