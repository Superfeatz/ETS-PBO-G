// Definisi Kelas Book
class Book {
    // Atribut atau properti dari kelas Mobil
    String judul;
    String penulis;
    String namaPenerbit;
    String kategori;
    int tahun_terbit;

    // Konstruktor untuk menginisialisasi objek Book
    public Book(String judul, String penulis, int tahun_terbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
        this.tahun_terbit = tahun_terbit;
    }

    // Metode untuk menunjukkan informasi dari objek
    public void printDetail() {
        System.out.println("judul: " + judul);
        System.out.println("penulis: " + penulis);
        System.out.println("namaPenerbit: " + namaPenerbit);
        System.out.println("kategori: " + kategori);
        System.out.println("tahun_terbit: " + tahun_terbit);
    }
}

public class MainBook { 
    public static void main(String[] args) {
        Book book1 = new Book("PBO book 1", "Hafidz", 2024, "Fidz Harridil", "jawaban no 2");
        Book book2 = new Book("PBO book 2", "Hafidz", 2024, "Fidz Mahali", "jawaban no 2");
        // Memanggil metode dari objek untuk menampilkan informasi
        book1.printDetail();
        System.out.println();
        book2.printDetail();
    }
}



















// Dalam pemrograman berorientasi objek (OOP), kelas dan objek adalah dua konsep fundamental. Berikut penjelasan perbedaannya:

// Kelas (Class):

// Kelas adalah sebuah blueprint atau cetak biru yang mendefinisikan properti (atribut) dan perilaku (metode) dari suatu objek. Kelas tidak mengambil ruang memori sampai ada objek yang diciptakan darinya.
// Kelas mendefinisikan tipe dari objek yang bisa dibuat, tetapi bukan objek itu sendiri.
// Objek (Object):

// Objek adalah instance dari sebuah kelas. Ketika sebuah kelas diinstansiasi, maka terciptalah objek. Objek memiliki keadaan (state) dan perilaku (behavior) yang sudah didefinisikan dalam kelasnya.
// Objek mengambil ruang memori dan bisa memiliki nilai berbeda dari properti yang didefinisikan dalam kelas.

// Penjelasan:
// Kelas Mobil: Adalah blueprint yang mendefinisikan tiga atribut (merk, warna, dan tahun) serta sebuah metode (tampilkanInfo).
// Objek mobil1 dan mobil2: Adalah instance dari kelas Mobil, masing-masing memiliki nilai atribut yang berbeda sesuai dengan informasi yang diberikan saat pembuatan objek.
// Setiap objek memiliki keadaan sendiri tetapi perilaku (metode) yang sama.