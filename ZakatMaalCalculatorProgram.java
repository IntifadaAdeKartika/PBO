import java.util.Scanner;

public class ZakatMaalCalculatorProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            // Menampilkan pilihan jenis harta
            System.out.println("Pilih jenis harta untuk dihitung zakat:");
            System.out.println("1. Uang Tunai");
            System.out.println("2. Emas");
            System.out.println("3. Perak");
            System.out.print("Masukkan pilihan (1-3): ");
            int choice = scanner.nextInt();

            // Meminta pengguna memasukkan jumlah harta
            System.out.print("Masukkan jumlah harta (dalam bentuk desimal, contoh: 1000000.50): ");
            double harta = scanner.nextDouble();

            // Menentukan nisab berdasarkan jenis harta
            double nisab = 0;
            double zakat = 0;

            switch (choice) {
                case 1: // Uang Tunai
                    nisab = 126735000.00; // Nisab untuk uang tunai
                    zakat = harta * 0.025; // Zakat 2.5%
                    break;
                case 2: // Emas
                    nisab = 126735000.00; // Nisab untuk emas
                    zakat = harta * 0.025; // Zakat 2.5%
                    break;
                case 3: // Perak
                    nisab = 6545000.00; // Nisab untuk perak
                    zakat = harta * 0.025; // Zakat 2.5%
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; // Kembali ke awal loop
            }

            // Pemeriksaan nisab
            if (harta >= nisab) {
                System.out.printf("Jumlah zakat yang harus dibayarkan adalah: %.2f%n", zakat);
            } else {
                System.out.println("Jumlah harta tidak mencapai nisab, tidak perlu membayar zakat.");
            }

            // Menanyakan apakah pengguna ingin menghitung lagi
            System.out.print("Hitung zakat lagi? (ya/tidak): ");
            String response = scanner.next();
            continueCalculating = response.equalsIgnoreCase("ya");
        }

        // Menutup scanner
        scanner.close();
        System.out.println("Terima kasih telah menggunakan Zakat Maal Calculator Program.");
    }
}
