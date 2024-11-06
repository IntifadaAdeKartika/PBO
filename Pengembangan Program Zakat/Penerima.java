public class Penerima {
    private String nama;
    private String alamat;
    private double jumlahZakatDiterima; // Atribut tambahan untuk jumlah zakat yang diterima

    // Konstruktor
    public Penerima(String nama, String alamat, double jumlahZakatDiterima) {
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahZakatDiterima = jumlahZakatDiterima;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getJumlahZakatDiterima() {
        return jumlahZakatDiterima;
    }

    public void setJumlahZakatDiterima(double jumlahZakatDiterima) {
        this.jumlahZakatDiterima = jumlahZakatDiterima;
    }
}