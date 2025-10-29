package Sebelum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = new String[10];
        int[] meja = new int[10];
        int count = 0;

        while (true) {
            System.out.println("1. Reservasi");
            System.out.println("2. Lihat Reservasi");
            System.out.println("3. Keluar");
            int pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan nama: ");
                nama[count] = input.next();
                System.out.print("Nomor meja: ");
                meja[count] = input.nextInt();
                count++;
            } else if (pilih == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Nama: " + nama[i] + ", Meja: " + meja[i]);
                }
            } else {
                break;
            }
        }
    }
}
