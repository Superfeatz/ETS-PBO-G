import java.util.Scanner;

public class ParkingTicketMachine {
    private int balance;       // saldo yang dimasukkan oleh pengguna
    private int ticketPrice;   // harga tiket parkir per jam
    private int ticketTime;    // jumlah waktu parkir yang dibeli

    // Constructor untuk mengatur harga tiket parkir
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    // Menambahkan uang ke dalam saldo
    public void insertMoney(int amount) {
        balance += amount;
        System.out.println("Uang yang dimasukkan: Rp " + amount);
    }

    // Mengeluarkan tiket parkir
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;  // Menghitung berapa jam waktu parkir yang dapat dibeli
            balance -= ticketTime * ticketPrice; // Mengurangi saldo sesuai dengan waktu parkir yang dibeli
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
        } else {
            System.out.println("Saldo tidak cukup untuk membeli tiket.");
        }
    }

    // Mengembalikan jumlah waktu parkir yang sudah dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Mengembalikan saldo yang tersisa
    public int getBalance() {
        return balance;
    }
 
    // Main 
    public static void main(String[] args) {
        // Scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Menentukan harga tiket parkir (misalnya Rp 5.000 per jam)
        ParkingTicketMachine machine = new ParkingTicketMachine(5000);

        // Input dari pengguna
        System.out.println("Selamat datang di mesin tiket parkir!");
        System.out.print("Masukkan jumlah uang yang ingin Anda masukkan (Rp): ");
        int amount = scanner.nextInt();
        
        // Memasukkan uang
        machine.insertMoney(amount);
        
        // Mencoba mengeluarkan tiket
        machine.issueTicket();

        // Menampilkan informasi tentang waktu parkir yang dibeli
        System.out.println("Jumlah waktu parkir yang dibeli: " + machine.getTimePurchased() + " jam");
        System.out.println("Sisa saldo: Rp " + machine.getBalance());
        
        scanner.close(); // Menutup Scanner
    }
}
