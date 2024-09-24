
package atm;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = null;
        AccountBank account = new AccountBank("Ronan Narendra", "672022123", 500000.0, 1.5); 

        while (true) {
            account.getAccountInfo();
            System.out.println("------ ATM BANK SENDIRI------\nMenu Pilihan:");
            System.out.println("1. Tarik Tunai\n2. Deposit\n3. Cek Saldo\n4. Keluar");
            System.out.print("Pilih 1-4: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Masukan jumlah yang ingin di tarik: ");
                    double amount = scanner.nextDouble();
                    account.tarikTunai(amount);
                    next(input);
                }


                case 2 -> {
                    System.out.print("Masukan jumlah yang ingin di deposit: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    next(input);
                }
                case 3 -> {
                    System.out.println("Pilih menu check:\n1. Check saldo sekarang\n2. Check saldo masa depan");
                    System.out.print("Pilih 1 atau 2: ");
                    int checkChoice = scanner.nextInt();
                    switch (checkChoice) {
                        case 1 -> account.cekSaldoSekarang();
                        case 2 -> {
                            System.out.print("Masukkan jumlah bulan untuk perhitungan bunga: ");
                            int bulan = scanner.nextInt();
                            account.cekSaldoMasaDepan(bulan);
                    }
                        default -> System.out.println("Pilihan tidak valid.");
                    }
                    next(input);
                }

                case 4 -> {
                    System.out.println("Terima kasih telah menggunakan ATM BANK SENDIRI!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
    public static void next(Scanner input){
       System.out.println("\nTekan Enter Untuk Lanjut");
       try{
           System.in.read();
       }catch (IOException e){
   }
}
}
    
