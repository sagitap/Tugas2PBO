import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int angkaRandom = random.nextInt(100) + 1; // 1 - 100
        int tebakan;
        int percobaan = 0;

        System.out.println("Tebak angka antara 1 sampai 100. Ketik 0 untuk keluar.");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();

            if (tebakan == 0) {
                System.out.println("Anda keluar dari permainan.");
                break;
            }

            percobaan++;

            if (tebakan == angkaRandom) {
                System.out.println("Selamat! Tebakan Anda benar.");
                System.out.println("Jumlah percobaan: " + percobaan);
                break;
            } else if (tebakan > angkaRandom) {
                System.out.println("Terlalu besar, coba lagi.");
            } else {
                System.out.println("Terlalu kecil, coba lagi.");
            }
        }

        scanner.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ketut
 */
public class tebakangka {
    
}
