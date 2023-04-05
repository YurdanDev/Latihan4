import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String na, String kl, String mat, int ni){
        nama = na;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            HashMap<String, Mahasiswa> mhs = new HashMap<>();
            String input;
            Mahasiswa data;

            mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
            mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
            mhs.put("3", new Mahasiswa("Arro", "3O", "Pemrograman", 2020017));

            System.out.println("Menu: ");
            System.out.println("1. Lihat data mahasiswa");
            System.out.println("2. Tambah data mahasiswa");
            System.out.println("3. Ubah data mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihan = in.nextInt();
            in.nextLine(); // membersihkan newline character dari buffer

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan ID: ");
                    input = in.nextLine();
                    data = mhs.get(input);
                    if (data != null){
                        System.out.println("Data Mahasiswa: " + data.nama + ", kelas: " + data.kelas + ", mata kuliah praktikum: " + data.matkulPraktikum + ", nim: " + data.nim);   
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                    case 2:
                    System.out.print("Masukkan ID mahasiswa baru: ");
                    input = in.nextLine();
                    if (mhs.containsKey(input)) {
                        System.out.println("ID sudah ada dalam database.");
                    } else {
                        System.out.print("Masukkan nama mahasiswa baru: ");
                        String nama = in.nextLine();
                        System.out.print("Masukkan kelas mahasiswa baru: ");
                        String kelas = in.nextLine();
                        System.out.print("Masukkan mata kuliah praktikum mahasiswa baru: ");
                        String matkul = in.nextLine();
                        System.out.print("Masukkan NIM mahasiswa baru: ");
                        int nim = in.nextInt();
                        mhs.put(input, new Mahasiswa(nama, kelas, matkul, nim));
                        System.out.println("Data mahasiswa berhasil ditambahkan.");
                    }
                    break;
                }
        }
        }
}
            