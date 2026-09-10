import java.util.Scanner;

public class Kasir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahBarang = 0;
        int totalBelanja = 0;
        int hargaBarang;
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("Masukkan harga barang.. ");
            hargaBarang = input.nextInt();

            jumlahBarang = jumlahBarang + 1;
            totalBelanja = totalBelanja + hargaBarang;

            String jawaban;
            do {
                System.out.println("Ada barang lagi ga? (y/n)");
                jawaban = input.next();
                
            } while (!jawaban.equalsIgnoreCase("y") && !jawaban.equalsIgnoreCase("n"));
            lanjut = jawaban.equalsIgnoreCase("y");
        }

        System.out.println("Jumlah Barang: " + jumlahBarang);
        System.out.println("Total belanja adalah " + totalBelanja);
    }
}