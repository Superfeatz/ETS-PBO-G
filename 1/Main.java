// Kelas induk (superclass)
class Buku {
    protected String judul;
    protected String penulis;

    // Konstruktor untuk kelas Buku
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Metode untuk menampilkan informasi buku
    public String info() {
        return "Judul: " + judul + ", Penulis: " + penulis;
    }
}

// Kelas turunan (subclass)
class EBook extends Buku {
    private double ukuranFile;

    // Konstruktor untuk kelas EBook
    public EBook(String judul, String penulis, double ukuranFile) {
        // Memanggil konstruktor kelas induk
        super(judul, penulis);
        this.ukuranFile = ukuranFile;
    }

    // Metode tambahan untuk EBook
    public String infoEBook() {
        return super.info() + ", Ukuran File: " + ukuranFile + " MB";
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Buku
        Buku buku1 = new Buku("Pemrograman Java", "John Doe");
        System.out.println(buku1.info());

        // Membuat objek dari kelas EBook
        EBook ebook1 = new EBook("Pemrograman Java", "John Doe", 5.25);
        System.out.println(ebook1.infoEBook());
    }
}
