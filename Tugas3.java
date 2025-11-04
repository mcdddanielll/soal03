/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

import java.util.Scanner;

/**
 *
 * @author Danielrorrrrr
 */
public class Tugas3 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
     System.out.print("Masukkan jumlah baris matriks: ");
        int baris = inputan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = inputan.nextInt();

        // Deklarasi matriks
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Input elemen matriks A
        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matriksA[i][j] = inputan.nextInt();
            }
        }

        // Input elemen matriks B
        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matriksB[i][j] = inputan.nextInt();
            }
        }

        // Proses penjumlahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("\nHasil penjumlahan matriks A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    
    
          }
    
}