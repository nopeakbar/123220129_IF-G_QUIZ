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

import kuis_123220129.HalamanLogin;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public abstract class FirstPage extends JFrame implements ActionListener  {
    int tugas;
    int quiz;
    String kelas;
    String nim;
    
    JLabel judul = new JLabel ("Halaman Input Nilai");
    JLabel judulkcl = new JLabel ("Silahkan Input/Cek Data");
    JLabel tipe = new JLabel ("Tipe Kelas");
    JLabel nama = new JLabel ("Nama Mahasiswa");
  
    JLabel matkul = new JLabel ("Mata Kuliah");
    JLabel nilaitugas = new JLabel ("Nilai Tugas");
    JLabel nilaikuis = new JLabel ("Nilai Kuis");
   
  
    JButton login = new JButton ("Masuk");
    
}
