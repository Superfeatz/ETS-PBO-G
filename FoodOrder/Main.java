
// File: Main.java
 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        // Inisialisasi menu
        restaurant.addMenuItem(new MenuItem("Nasi Goreng", 25000, "Nasi goreng spesial", "Main Course"));
        restaurant.addMenuItem(new MenuItem("Mie Goreng", 23000, "Mie goreng spesial", "Main Course"));
        restaurant.addMenuItem(new MenuItem("Es Jeruk", 8000, "Es jeruk segar", "Beverage"));
        restaurant.addMenuItem(new MenuItem("Es Teh", 5000, "Es teh manis", "Beverage"));
        restaurant.addMenuItem(new MenuItem("Ayam Goreng", 30000, "Ayam goreng crispy", "Main Course"));

        Order order = restaurant.createOrder();
        boolean ordering = true;

        while (ordering) {
            restaurant.displayMenu();
            System.out.println("\nPilihan:");
            System.out.println("1-5: Pilih menu");
            System.out.println("0: Selesai dan bayar");
            System.out.print("\nMasukkan pilihan Anda: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                if (order.getMenuItems().isEmpty()) {
                    System.out.println("Pesanan kosong! Silakan pilih menu terlebih dahulu.");
                    continue;
                }
                ordering = false;
            } else if (choice >= 1 && choice <= 5) {
                MenuItem selectedItem = restaurant.getMenuItem(choice - 1);
                if (selectedItem != null) {
                    order.addItem(selectedItem);
                    System.out.printf("%s telah ditambahkan ke pesanan%n", selectedItem.getName());
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            // Tampilkan total sementara
            if (!order.getMenuItems().isEmpty()) {
                System.out.printf("%nTotal pesanan saat ini: Rp %,.0f%n", order.getTotalPrice());
            }
        }

        // Proses pembayaran
        System.out.println("\n=== PEMBAYARAN ===");
        System.out.printf("Total yang harus dibayar: Rp %,.0f%n", order.getTotalPrice());
        
        boolean paymentValid = false;
        while (!paymentValid) {
            System.out.print("Masukkan jumlah pembayaran: Rp ");
            double payment = scanner.nextDouble();
            
            if (order.processPayment(payment)) {
                System.out.println("\n=== STRUK PEMBAYARAN ===");
                System.out.println("Item yang dipesan:");
                for (MenuItem item : order.getMenuItems()) {
                    System.out.printf("- %-15s Rp %,.0f%n", item.getName(), item.getPrice());
                }
                System.out.println("------------------------");
                System.out.printf("Total Pembayaran  : Rp %,.0f%n", order.getTotalPrice());
                System.out.printf("Uang Diberikan   : Rp %,.0f%n", payment);
                System.out.printf("Kembalian        : Rp %,.0f%n", order.getChange());
                System.out.println("------------------------");
                System.out.println("Terima kasih atas pesanan Anda!");
                paymentValid = true;
            } else {
                System.out.println("Pembayaran kurang! Silakan masukkan nominal yang cukup.");
            }
        }

        scanner.close();
    }
}
