/*import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> daftarTugas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu To-Do List:");
            System.out.println("1. Tambah tugas");
            System.out.println("2. Lihat semua tugas");
            System.out.println("3. Hapus tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String tugasBaru = scanner.nextLine();
                    daftarTugas.add(tugasBaru);
                    System.out.println("Tugas berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Tugas:");
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < daftarTugas.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarTugas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Daftar tugas kosong, tidak ada yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                        int nomor = scanner.nextInt();
                        scanner.nextLine();
                        if (nomor > 0 && nomor <= daftarTugas.size()) {
                            daftarTugas.remove(nomor - 1);
                            System.out.println("Tugas berhasil dihapus.");
                        } else {
                            System.out.println("Nomor tugas tidak valid.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ketut
 */
public class todolist {
    
}
