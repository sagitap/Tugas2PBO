/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lagi;

        do {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.println("Hasil: " + (angka1 + angka2));
                    break;
                case '-':
                    System.out.println("Hasil: " + (angka1 - angka2));
                    break;
                case '*':
                    System.out.println("Hasil: " + (angka1 * angka2));
                    break;
                case '/':
                    if (angka2 != 0) {
                        System.out.println("Hasil: " + (angka1 / angka2));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        System.out.println("Hasil: " + (angka1 % angka2));
                    } else {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid.");
            }

            System.out.print("Ingin menghitung lagi? (y/n): ");
            lagi = scanner.next().charAt(0);
            scanner.nextLine(); // membersihkan buffer
        } while (lagi == 'y' || lagi == 'Y');

        scanner.close();
    }
}

 * @author ketut
 */
public class kalkulatorsederhana {
    
}
