package atm;

public class AccountBank {
    private final String namaRekening;
    private final String nomorRekening;
    private double balance;
    private final double interestRate; 

    //CONSTRUCTOR
    public AccountBank(String namaRekening, String nomorRekening, double balance, double interestRate) {
        this.namaRekening = namaRekening;
        this.nomorRekening = nomorRekening;
        this.balance = balance;
        this.interestRate = interestRate;
    }

//METHOD 1
    public void tarikTunai(double amount) {
        if (amount > balance) {
            System.out.println("Saldo tidak cukup boss!");
        } else {
            balance -= amount;
            System.out.println("Tarik tunai berhasil! Saldo Anda sekarang: " + balance);
        }
    }
//METHOD 2
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit berhasil! Saldo Anda sekarang: " + balance);
    }

//METHOD 3
    public void cekSaldoSekarang() {
        System.out.println("Saldo saat ini: " + balance);
    }

//METHOD 4
    public void cekSaldoMasaDepan(int bulan) {
        double saldoMasaDepan = balance * Math.pow(1 - (interestRate / 100), bulan);
        System.out.println("Saldo Anda setelah " + bulan + " bulan dengan bunga adalah: " + saldoMasaDepan);
    }

//METHOD 5
    public void getAccountInfo() {
        System.out.println("Account Holder: " + namaRekening);
        System.out.println("Account Number: " + nomorRekening);
    }

    }

    
