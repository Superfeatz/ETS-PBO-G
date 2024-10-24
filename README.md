# Nama : Muhammad Hafidz Harridil Mahali
# NRP : 5025221030
# Kelas PBO G

# 4 Food Order System

Sistem pemesanan makanan sederhana berbasis console yang memungkinkan pengguna untuk melihat menu, melakukan pemesanan, dan melakukan pembayaran.

## Struktur Proyek

```
src/
└── foodorder/
    ├── MenuItem.java    # Class untuk item menu
    ├── Order.java       # Class untuk mengelola pesanan
    ├── Restaurant.java  # Class untuk mengelola restoran
    └── Main.java        # Class utama program
```

## Fitur

- Menampilkan daftar menu dengan harga
- Pemesanan makanan interaktif
- Perhitungan total pesanan otomatis
- Sistem pembayaran dengan perhitungan kembalian
- Pencetakan struk pembelian

## Persyaratan Sistem

- Java Development Kit (JDK) 8 atau lebih tinggi
- Java Compiler (javac)

## Cara Menjalankan Program

1. **Kompilasi Program**
   ```bash
   javac foodorder/*.java
   ```

2. **Menjalankan Program**
   ```bash
   java foodorder.Main
   ```

## Cara Penggunaan

1. Ketika program dijalankan, daftar menu akan ditampilkan
2. Masukkan nomor menu (1-5) untuk memilih item
3. Untuk menyelesaikan pesanan, masukkan 0
4. Masukkan jumlah uang untuk pembayaran
5. Program akan menampilkan struk dengan detail pesanan dan kembalian

## Contoh Interaksi

```
=== MENU RESTORAN ===
No.     Nama            Harga
------------------------
1.      Nasi Goreng     Rp 25,000
2.      Mie Goreng      Rp 23,000
3.      Es Jeruk        Rp 8,000
4.      Es Teh          Rp 5,000
5.      Ayam Goreng     Rp 30,000
------------------------

Pilihan:
1-5: Pilih menu
0: Selesai dan bayar

Masukkan pilihan Anda: _
```

## Struktur Class

### MenuItem.java
- Menyimpan informasi item menu (id, nama, harga, deskripsi, kategori)
- Menggunakan UUID untuk identifikasi unik

### Order.java
- Mengelola daftar item yang dipesan
- Menghitung total harga
- Memproses pembayaran dan kembalian

### Restaurant.java
- Mengelola daftar menu
- Menampilkan menu
- Membuat pesanan baru

### Main.java
- Program utama untuk interaksi dengan pengguna
- Menangani input dan output
- Mengelola alur program



## Lisensi

Proyek ini bersifat open source dan dapat digunakan untuk tujuan pembelajaran.
