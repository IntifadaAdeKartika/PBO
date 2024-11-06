import java.util.Scanner;

public class ZakatMaalCalculator {
    private static final double GOLD_PRICE_PER_GRAM = 1000000.0; // Misal harga emas per gram
    private static final double SILVER_PRICE_PER_GRAM = 20000.0; // Misal harga perak per gram

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            // Meminta nama Muzaki
            System.out.print("Masukkan nama Muzaki: ");
            String namaMuzaki = scanner.nextLine();

            // Menampilkan pilihan jenis harta
            System.out.println("Pilih jenis harta:");
            System.out.println("1. Uang Tunai");
            System.out.println("2. Emas (dalam gram)");
            System.out.println("3. Perak (dalam gram)");
            System.out.print("Masukkan pilihan (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer setelah nextInt()

            double harta = 0;
            String jenisHarta;

            switch (choice) {
                case 1: // Uang Tunai
                    jenisHarta = "Uang Tunai";
                    System.out.print("Masukkan jumlah harta (dalam rupiah): ");
                    harta = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan buffer setelah nextDouble()
                    break;
                case 2: // Emas
                    jenisHarta = "Emas";
                    System.out.print("Masukkan jumlah emas (dalam gram): ");
                    double beratEmas = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan buffer setelah nextDouble()
                    harta = beratEmas * GOLD_PRICE_PER_GRAM; // Menghitung nilai emas dalam rupiah
                    break;
                case 3: // Perak
                    jenisHarta = "Perak";
                    System.out.print("Masukkan jumlah perak (dalam gram): ");
                    double beratPerak = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan buffer setelah nextDouble()
                    harta = beratPerak * SILVER_PRICE_PER_GRAM; // Menghitung nilai perak dalam rupiah
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // Kembali ke awal loop
            }

            Muzaki muzaki = new Muzaki(namaMuzaki, harta, jenisHarta);
            double nisab = (choice == 1 || choice == 2) ? 85000000.0 : 11900000.0;
            double zakat = muzaki.calculateZakat(nisab);

            if (zakat > 0) {
                System.out.printf("Jumlah zakat yang harus dibayarkan oleh %s (jenis harta: %s) adalah: %.2f%n",
                        muzaki.getNama(), muzaki.getJenisHarta(), zakat);

                Penerima penerima = new Penerima("Yayasan Zakat", "Jl. Berkah No.1", 0);
                penerima.addZakat(zakat);
                penerima.displayPenerimaInfo();
            } else {
                System.out.println("Jumlah harta tidak mencapai nisab, tidak perlu membayar zakat.");
            }

            System.out.print("Apakah Anda ingin menghitung zakat lagi? (ya/tidak): ");
            String response = scanner.nextLine(); 
            continueCalculating = response.equalsIgnoreCase("ya");
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan Program Kalkulator Zakat Maal.");
    }
}
