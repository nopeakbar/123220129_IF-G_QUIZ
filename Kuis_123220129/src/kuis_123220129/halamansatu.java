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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import kuis_123220129.HalamanLogin;

/**
 *
 * @author Lab Informatika
 */
public class halamansatu extends JFrame implements ActionListener {
    JLabel judul = new JLabel ("Halaman Input Nilai");
    JLabel judulkcl = new JLabel ("Silahkan Input/Cek Data");
    JLabel tipe = new JLabel ("Tipe Kelas");
    JLabel nama = new JLabel ("Nama Mahasiswa");
    JLabel nim = new JLabel ("Nama Mahasiswa");
    JLabel matkul = new JLabel ("Mata Kuliah");
    JLabel nilaitugas = new JLabel ("Nilai Tugas");
    JLabel nilaikuis = new JLabel ("Nilai Kuis");
    JTextField inputusername = new JTextField();
    JTextField inputnim = new JTextField();
    JButton login = new JButton ("Masuk");

    halamansatu(){
        setVisible(true);
        setSize(550, 550);
        setTitle("Login");
        setDefaultCloseOperation
        (JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(judul);
        judul.setFont(judul.getFont().deriveFont(30.0F));
        judul.setBounds(100, 40, 400, 45);
        
        add(judulkcl);
        judulkcl.setFont(judulkcl.getFont().deriveFont(20.0F));
        judulkcl.setBounds(150, 70, 300, 45);
        
        add(nama);
        add(nim);
        add(inputusername);
        add(inputnim);
        add(login);
        
        nama.setBounds(40, 130, 200, 50);
        inputusername.setBounds(40, 170, 450, 35);
        nama.setFont(nama.getFont().deriveFont(17.0F));
        
        nim.setBounds(40, 220, 50, 50);
        inputnim.setBounds(40, 260, 450, 35);
        nim.setFont(nim.getFont().deriveFont(17.0F));
        
        login.setBounds(40, 390, 450, 35);
        login.setFont(login.getFont().deriveFont(17.0F));
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputusername.getText();
            String pass = inputnim.getText();
        
            if(username.isEmpty() || pass.isEmpty()){
                throw new Exception ("Gaboleh ada yang kosong yh, harus diisi");
            }
        
            new halamansatuImpl(username);
            this.dispose();
        } catch (Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
    }
