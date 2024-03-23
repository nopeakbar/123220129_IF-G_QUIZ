/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220129;

/**
 *
 * @author ASUS Vivobook
 */
import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Mahasiswa {
    String nim;
    String nama;
    int nilaiTugas;
    int nilaiKuis;
    String kelas;
    
    Mahasiswa(String nim, int nilaiTugas, int nilaiKuis, String kelas) {
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiKuis = nilaiKuis;
        this.kelas = kelas;
    }
    
    double calculateScore() {
        double score = 0.0;
        if (kelas.equals("Teori")) {
            score = nilaiTugas * 0.70 + nilaiKuis * 0.30;
        } else if (kelas.equals("Praktikum")) {
            score = nilaiTugas * 0.30 + nilaiKuis * 0.70;
        }
        return score;
    }
    
    boolean isPassed() {
        return calculateScore() >= 85;
    }
}

public class pagetwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih kelas dulu (teori/praktikum)");
        String kelasChoice = scanner.nextLine();
        
        String kelas = "";
        if (kelasChoice.equalsIgnoreCase("Teori")) {
            kelas = "Teori";
        } else if (kelasChoice.equalsIgnoreCase("Praktikum")) {
            System.out.println("Ketik ya untuk lanjut");
            kelas = scanner.nextLine();
        } else {
            System.out.println("Pilihan divisi tidak valid.");
            return;
        }
        
        System.out.println("Input data mahasiswa:");
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nilai Tugas: ");
        int nilaiTugas = scanner.nextInt();
        System.out.print("Nilai Kuis: ");
        int nilaiKuis = scanner.nextInt();
        
        
        Mahasiswa mahasiswa = new Mahasiswa(nim, nilaiTugas, nilaiKuis, kelas);
        
        System.out.println("Data mahasiswa berhasil tersimpan.");
        
        System.out.println("Mau edit data atau cek hasil? (edit/cek)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("edit")) {
            System.out.println("Implementasi pengeditan data di sini.");
        } else if (choice.equalsIgnoreCase("cek")) {
            System.out.println("Mahasiswa lulus? " + (mahasiswa.isPassed() ? "Ya" : "Tidak"));
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
    }
}


